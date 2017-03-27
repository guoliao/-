package com.platform.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.platform.entit.Post;
import com.platform.entit.Post_type;

@Repository
public interface AdminUserMapper {
    
	
	public List<Post>   findAllPost();    //管理员查看所有的帖子
	
	public void updatePost(Post post);     //管理员删除帖子(更改状态)
	
	public void addPostType(Post_type pt);   //管理员添加帖子类别
	
	public List<Post_type> findAllType();    //管理员查找所有类别
}
