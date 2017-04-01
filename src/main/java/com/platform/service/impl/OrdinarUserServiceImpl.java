package com.platform.service.impl;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.platform.common.contants.Constants;
import com.platform.common.utils.UUIDUtil;
import com.platform.common.utils.UploadUtil;
import com.platform.entit.Comment;
import com.platform.entit.News;
import com.platform.entit.Post;
import com.platform.entit.Post_img;
import com.platform.entit.Reply;
import com.platform.entit.User;
import com.platform.entity.vo.PostVo;
import com.platform.entity.vo.UserVo;
import com.platform.mapper.OrdinarUserMapper;
import com.platform.service.OrdinarUserService;

@Service
public class OrdinarUserServiceImpl implements OrdinarUserService {
	
	@Autowired
	private OrdinarUserMapper ordinarUserMapper;
   
	/*
	 * 普通用户注册
	 * @see com.platform.service.OrdinarUserService#UserRegistration(com.platform.entit.User)
	 */

	public void clearUserRegistration(User user) {
		
		 ordinarUserMapper.clearUserRegistration(user);
	}
   /*
    * 用户名是否存在
    * @see com.platform.service.OrdinarUserService#UserNameYou(java.lang.String)
    */
	public int selectUserNameYou(String username) {
		
		return ordinarUserMapper.selectUserNameYou(username);
	}
    /*
     * 普通用户发帖
     */
     public void clearUserPost(Post post) {
 
    	 ordinarUserMapper.clearUserPost(post);
     }
	/*
	 * 
	 * 普通用户查看帖子
	 */
     
     public List<Post> selectPost(){

    	 return ordinarUserMapper.selectPost();
     }
     /*
      * 普通用户修改帖子
      * @see com.platform.service.OrdinarUserService#updateAreaUser(com.platform.entit.Post)
      */
	public void updateAreaUser(Post post) {
		ordinarUserMapper.updateAreaUser(post);
		
	}
	/*
	 * 普通用户删除帖子
	 */
	 public void delectPost(List<Post> list){
		 
		 ordinarUserMapper.delectPost(list);
		 
	 }  
	 
	 /*
	  * 普通用户评论帖子
	  */
	 public void addPost(Comment com){
		 ordinarUserMapper.addPost(com);
		 
	 }
	 
	/*
	 * 普通用户查看评论
	 * @see com.platform.service.OrdinarUserService#selectComment(java.util.Map)
	 */
	public List<UserVo> selectComment(Map<String, Object> comm) {
		
		return ordinarUserMapper.selectComment(comm);
	}
	 /*
	  * 普通用户回复评论
	  */
	public void addReply(Reply rep) {
		ordinarUserMapper.addReply(rep);
	}
	 /*
	  * 普通用户查看帖子回复评论
	  */
   public List<UserVo> selectUserPost(Map<String,Object> map){
	   
	   
	   return ordinarUserMapper.selectUserPost(map);
   } 
   /* 普通用户发表图片
    * 
    */
   public void  addPhotoPost(Post_img pi,MultipartFile permitsfile,String filepath){
	   
	   String fileName = permitsfile.getOriginalFilename();  //获取图片原路径
        String u_id= UUIDUtil.getRandom32PK();
		String newfileName = u_id + fileName.substring(fileName.lastIndexOf(".")); 
		pi.setPi_img_name(newfileName);
	    System.out.println("获取到的图片********"+newfileName);
		ordinarUserMapper.addPhotoPost(pi);

		UploadUtil.saveFile(permitsfile, filepath, u_id);
   }
    /*
     * 消息推送               
     */
  public void addDiagram(News news) {
	
	ordinarUserMapper.addDiagram(news);
     }
  /*
   * 普通用户查看帖子详情
   */
	public List<UserVo> findOnePost(Map<String, Object> map) {
	
		return ordinarUserMapper.findOnePost(map);
	}
   /*
    * 普通用户查看评论，回复
    */
public List<UserVo> selectComAndRep(Map<String,Object> map) {
	
	return ordinarUserMapper.selectComAndRep(map);
	
	
}

/*
 * 普通用户搜索帖子
 */

public List<UserVo>   selectPostByTitle(Map<String,Object> map){
	
	
	return ordinarUserMapper.selectPostByTitle(map);
	
}
}
