package com.platform.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.platform.common.contants.Constants;

/**
 * 后台登陆拦截器
 */
public class LoginInterceptor implements HandlerInterceptor {

	
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
	
		System.out.println("进入拦截器 preHandle 方法");
		System.out.println("applicationContext   "+request.getContextPath());
		Object user = request.getSession().getAttribute(Constants.SESSION_USER );
		System.out.println("拦截器 user   " + user);
		if (user == null) {
			System.out.println("拦截器 user   为空");
			response.sendRedirect(request.getContextPath()+"/user/login/toLogin");
			return false;
		}

		return true;
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {

	}

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
	

	}


}
