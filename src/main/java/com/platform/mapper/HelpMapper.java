package com.platform.mapper;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.platform.entit.Post;
import com.platform.entit.User;

@Repository
public interface HelpMapper {
	 
	public User userLogin(Map<String,Object> map);   //用户登录
	
	public Post selectTitleByID(String p_id);       //根据帖子ID查找帖子标题

}
