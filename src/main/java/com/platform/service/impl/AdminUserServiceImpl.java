package com.platform.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.platform.entit.Post;
import com.platform.entit.Post_type;
import com.platform.mapper.AdminUserMapper;
import com.platform.service.AdminUserService;

@Service
public class AdminUserServiceImpl implements AdminUserService {
    @Autowired
    AdminUserMapper  adminUserMapper;
    /*
     * 管理员查看所有帖子 
     */
	public List<Post> findAllPost() {
		
		return adminUserMapper.findAllPost();
	}
   /*
    * 管理员删除帖子（更改用户状态）
    */
	public void updatePost(Post post) {
		adminUserMapper.updatePost(post);
		
	}

	/*
	 * 管理员添加帖子类别
	 */
	
public void addPostType(Post_type pt) {
	
	adminUserMapper.addPostType(pt);
} 
	/*
	 * 管理员查找所有类别
	 */
	public List<Post_type> findAllType() {
		
		return adminUserMapper.findAllType();
	}

}
