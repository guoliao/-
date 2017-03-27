package com.platform.web.controller.login;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.DisabledAccountException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.platform.common.contants.Constants;
import com.platform.common.utils.DateUtil;
import com.platform.entit.User;
import com.platform.service.HelpService;
import com.platform.service.OrdinarUserService;

@Controller
@RequestMapping(value = "/user/login/")
public class UserLogin {
	
	

	@Autowired
    private OrdinarUserService ordinarUserService;

	@Autowired
	private   HelpService  helpservice;
	

	@RequestMapping(value="to_Login")
	public String to_Login(){
System.out.println("123");
		return "user/login";
	}
	
	
	@RequestMapping(value="userLogin" , method=RequestMethod.POST)
	public String  userLogin(Model model, String username, String password, String checkcode , HttpSession session) {
	   System.out.println("获取到的用户名 :"+username+"获取到的密码 :"+password);
	    User user=new User();
		Map<String,Object>   maps=new HashMap<String, Object>();
		maps.put("username", username);
		maps.put("password", password);
	    user =	helpservice.userLogin(maps);
	    model.addAttribute("list", "登陆成功");
		session.setAttribute(Constants.SESSION_USER, user);
		
		try {
			
            System.out.println("验证密码完毕------------------");
		} catch (UnknownAccountException e) {
			model.addAttribute("error", "账号不存在");
			session.removeAttribute(Constants.SESSION_USER);  
			return "user/login";
		} catch (DisabledAccountException e) {
			model.addAttribute("error", "账号未启用");
			session.removeAttribute(Constants.SESSION_USER);  
			return "user/login" ;
		} catch (IncorrectCredentialsException e) {
			model.addAttribute("error", "账号密码不匹配");
			session.removeAttribute(Constants.SESSION_USER);  
			return "user/login" ;
		} catch (AuthenticationException e) {// 登录失败
			model.addAttribute("error", "未知错误，请联系管理员。");

			session.removeAttribute(Constants.SESSION_USER);  
			return "user/login" ;
		} catch (RuntimeException e) {
			model.addAttribute("error", "糟糕，系统出错了，请稍后再试！");
			session.removeAttribute(Constants.SESSION_USER);  
			return "user/login" ;
		}
		return "user/index";
	}
	
	
	/**
	 * 用户退出
	 */
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.removeAttribute(Constants.SESSION_USER);  
		return "";
	}
	
	

}
