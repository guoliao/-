package com.platform.service;

import java.util.List;
import java.util.Map;

import org.springframework.web.multipart.MultipartFile;

import com.platform.entit.Comment;
import com.platform.entit.News;
import com.platform.entit.Post;
import com.platform.entit.Post_img;
import com.platform.entit.Reply;
import com.platform.entit.User;
import com.platform.entity.vo.PostVo;
import com.platform.entity.vo.UserVo;



public interface OrdinarUserService  {

	 public void clearUserRegistration(User user);           //贴吧用户注册
	 
	 public int selectUserNameYou(String username);          //用户名是否存在
	 
	 public void clearUserPost(Post post);                        //普通用户发帖
	 
	 public List<Post> selectPost();                          //普通用户查看帖子
	 
	 public void updateAreaUser(Post post);                  //普通用户修改帖子
	 
	 public void delectPost(List<Post> list);                //普通用户删除帖子
	 
	 public void addPost(Comment com);                       //普通用户评论帖子
	 
	 public List<UserVo> selectComment(Map<String,Object> comm); //普通用户查看评论
	 
	 public void  addReply(Reply rep);                        //普通用户回复评论
	 
	 public List<UserVo> selectUserPost(Map<String,Object> map);  //普通用户查看帖子，回复，评论
	 
	 public void  addPhotoPost(Post_img pi,MultipartFile permitsfile,String filepath); //普通用户发附加图片
	 
	 public void  addDiagram(News news);                           //消息推送
	 
	 public List<UserVo> findOnePost(Map<String,Object> map);            //普通用户查看帖子详情
	 
	 public List<UserVo>  selectComAndRep(Map<String,Object> map) ;      //普通用户查看回复，评论
	 
	 public List<UserVo>   selectPostByTitle(Map<String,Object> map);     //普通用户搜索帖子
}
