package com.platform.web.controller.admin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mysql.fabric.xmlrpc.base.Array;
import com.platform.common.contants.Constants;
import com.platform.common.utils.UUIDUtil;
import com.platform.entit.Comment;
import com.platform.entit.News;
import com.platform.entit.Post;
import com.platform.entit.Post_type;
import com.platform.service.AdminUserService;
import com.platform.service.OrdinarUserService;

@Controller
@RequestMapping("/admin/user/")
public class AdminUserController {
         
	@Autowired
	AdminUserService  adminUserService;
	
	@Autowired
	OrdinarUserService  ordinarUserService;
	/*
	 * 管理员查看所有帖子
	 */
    @RequestMapping(value="allPost" , method = RequestMethod.GET)
    public String allPost(HttpSession session,Model model){
	
    	List<Post>  list= new ArrayList<Post>();
    	list =adminUserService.findAllPost();
    	
    	model.addAttribute("list", list);
    	System.out.println("查到所有的帖子" +list);
	    return"";
   }
   /*
    * 管理员删除帖子（更改用户状态）
    */
    @RequestMapping(value="delectPost" ,method = RequestMethod.GET)
    public String delectPost(Model model,Post post){
    	
    	adminUserService.updatePost(post);	
    	model.addAttribute("list", "更改成功");
    	News  news=new News();
    	news.setN_title(post.getP_title());
    	news.setP_id(post.getP_id());
    	news.setUser_id(post.getUser_id());
    	news.setN_type(Constants.User_Type_ZD);
    	ordinarUserService.addDiagram(news);
    	
    	return  "";
    }
    /*
     * 管理员添加所属类别
     */
    @RequestMapping(value="addPostType", method = RequestMethod.GET) 
    public String addPostType(Model model,Post_type pt){
    	
    	pt.setPt_id(UUIDUtil.getRandom32PK());
    	
    	adminUserService.addPostType(pt);
    	
    	model.addAttribute("list", "类别添加成功");
    	return "user/login";  	
    }
    /*
     * 管理员查找所有类别
     */
    @RequestMapping(value="findAllType", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, Object> findAllType(Model model){
    	List<Post_type> list=new ArrayList<Post_type>();
    	Map<String, Object>  map=new HashMap<String, Object>();
    	list=adminUserService.findAllType();
    	map.put("list", list);
    	
    	
    	return map;
   }
}
