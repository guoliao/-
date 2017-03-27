package com.platform.service.impl;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.entit.Post;
import com.platform.entit.User;
import com.platform.mapper.HelpMapper;
import com.platform.service.HelpService;

@Service
public class HelpServiceImpl implements HelpService {
         
	@Autowired 
	
	private HelpMapper helpmapper;


	public User userLogin(Map<String, Object> map) {

			return helpmapper.userLogin(map);
	}
	/*
	 * 根据帖子ID查找帖子标题
	 */
	public Post selectTitleByID(String p_id) {
		
		return helpmapper.selectTitleByID(p_id);
	}
	  
}
