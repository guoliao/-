package com.platform.web.controller.login;

import java.io.PrintWriter;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import com.alibaba.fastjson.JSON;
import com.platform.common.contants.Constants;
import com.platform.common.utils.GetClicntIP;
import com.platform.entit.User;


/**
 * 后台登陆拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {

	@Autowired
	private  RedisTemplate<String, String> redisTemplate ;
	private  ValueOperations<String, String> zstringOps  ;
	private  ListOperations<String, String>  zListOps ;
	@PostConstruct
	public void init() {
		zstringOps = redisTemplate.opsForValue() ;
		zListOps = redisTemplate.opsForList() ;
	}
	
	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
	
		System.out.println("进入拦截器 preHandle 方法");
		String path = request.getServletPath();     //获取路径
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html");
		Object user = request.getSession().getAttribute(Constants.SESSION_USER);
		System.out.println("拦截器 user   " + user);
		
		/**********登录  拦截**********/
		if (user == null) {   
			System.out.println("拦截器 user   为空");
			response.sendRedirect(request.getContextPath()+"/user/login/toLogin");
			return false;
		 /**********权限  拦截*********/
		}else {   System.out.println("/*****************************权限验证****************************/");
		
		String ip =GetClicntIP.getRemoteHost(request);  //根据用户类别获得用户的权限
		User userinfo = JSON.parseObject(zstringOps.get(ip) , User.class ) ;   // 获取用户信息，从redis
		System.out.println("用户的权限 : "+  userinfo.getLevel() );
		
		if(userinfo.getLevel() == 1 ){  // 普通贴吧用户
			
			if(this.checkUrl(Constants.RedisSet_SellerKey , path)){
				return true ;
			}
			 
		}else{   // 管理员
			
			if(this.checkUrl(Constants.RedisSet_AdminKey , path)){
				return true ;
			}
			
		}
		PrintWriter out=response.getWriter();
		out.println(" <h1><span style='color:red'>抱歉， 您没有权限访问该资源！ </span></h1>");
		out.close();
		out.flush();
		return false;
	  }
	}

	
	/****没用上的方法****/
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	

	}
	
	
	/**
	 * 验证Url
	 */
	public  boolean checkUrl(String key , String path ){
System.out.println(path);		
		 List<String> allPath = null ;    // url 集合
		 allPath = zListOps.range( key , 0, -1 ) ;
		System.out.println(allPath.toString()); 
		 for(String s : allPath ){
			 if( path.contains( s ) ){   
				 System.out.println("满足条件的路径"+path);
					return true;
			 }
		 }
		 return false ;
	}
	
	


}
