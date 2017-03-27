package com.platform.common.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;

public class GetClicntIP {
	
	
	//获取客户端的IP
	public static String getRemoteHost(HttpServletRequest request){ 
		
	    String ip = request.getHeader("x-forwarded-for"); 
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){ 
	        ip = request.getHeader("Proxy-Client-IP"); 
	    } 
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){ 
	        ip = request.getHeader("WL-Proxy-Client-IP"); 
	    } 
	    if(ip == null || ip.length() == 0 || "unknown".equalsIgnoreCase(ip)){ 
	        ip = request.getRemoteAddr(); 
	    } 
	    return ip; 
	
	} 
	
	public static String getIP(){
		
		String ip= null;
		try {
			ip = InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		
		return ip;
	}


}
