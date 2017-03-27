package com.platform.service;

import java.util.Map;

import com.platform.entit.Post;
import com.platform.entit.User;

public interface HelpService {
    
	
	public User userLogin(Map<String,Object> map);   //贴吧用户登录
	
	public Post selectTitleByID(String p_id);       //根据帖子ID查找帖子标题
}
