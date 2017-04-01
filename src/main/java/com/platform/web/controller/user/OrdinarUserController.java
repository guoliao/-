package com.platform.web.controller.user;

import java.beans.PropertyEditorSupport;
import java.io.File;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
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
import com.platform.service.HelpService;
import com.platform.service.OrdinarUserService;

@Controller
@RequestMapping("/pbs/user/")
public class OrdinarUserController {

	@Autowired
	OrdinarUserService ordinarUserService;

	@Autowired
	HelpService helpservice;
	// redis 实例化
	@Autowired
	public RedisTemplate<String, String> redisTemplate;
	public ValueOperations<String, String> zstringOps;

	@PostConstruct
	public void init() {
		zstringOps = redisTemplate.opsForValue();
	}

	/*
	 * 将传来的时间戳字符串转成Timestamp
	 */
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		binder.registerCustomEditor(Timestamp.class, new CustomDateEditor(dateFormat, false));
	}

	/**
	 * 定位到 -- 注册页面
	 */
	@RequestMapping(value = "to_Register", method = RequestMethod.GET)
	public String to_Register(Model model) {
		return "user/register";
	}
	
	/**
	 * 定位到 -- 主页面
	 */
	@RequestMapping(value = "to_index", method = RequestMethod.GET)
	public String to_index(Model model) {
		return "user/index";
	}

	/**
	 * 定位到 -- 发帖页面
	 */
	@RequestMapping(value = "to_Publish_post", method = RequestMethod.GET)
	public String publish_post(Model model) {
		return "user/publish_post";
	}
	
	/**
	 * 返回帖子
	 */
	@RequestMapping(value = "Publish_post", method = RequestMethod.GET)
	public String Publish_post(Model model) {
		return "user/publish_post";
	}
	/**
	 * 普通贴吧用户注册
	 */

	@RequestMapping(value = "userLogin", method = RequestMethod.POST)
	public String userLogin(User user, HttpSession session, Model model) {
		System.out.println("************进入注册接口" + user);

		int count = ordinarUserService.selectUserNameYou(user.getUsername());

		if (count != 0) {

			model.addAttribute("no", "用户名已经存在");

			return "rediract:to_Register";

		}
		user.setUser_id(UUIDUtil.getRandom32PK());
		user.setLevel(Constants.USER_Level_NumberTwo);
		user.setPhone(user.getUsername());
		ordinarUserService.clearUserRegistration(user); // 用户注册
		System.out.println("恭喜注册成功");
		model.addAttribute("list", "注册成功");
		return "user/login";
	}

	/*
	 * 普通用户发帖
	 */
	@RequestMapping(value = "userPost", method = RequestMethod.POST)
	public String userPost(Post post, HttpSession session, Model model, MultipartFile permitsfile, Post_img pi) {

		System.out.println("普通用户发帖" + post);
		User u = (User) session.getAttribute(Constants.SESSION_USER);
		post.setP_id(UUIDUtil.getRandom32PK());
		post.setUser_id(u.getUser_id());
		post.setP_level(Constants.User_Type_BZD);
		post.setP_del_state(Constants.POST_TYPE_YOU);
		ordinarUserService.clearUserPost(post);
		boolean flag = UploadUtil.YzImgType(permitsfile);

		if (!flag) {
			model.addAttribute("error", "文件格式错误!");
			return "user/publish_post";
		}
		pi.setP_id(post.getP_id());
		String filepath = session.getServletContext().getRealPath(Constants.UPLOAD_USER_SINESSLICENSES_PATH);
		System.out.println(filepath);
		ordinarUserService.addPhotoPost(pi, permitsfile, filepath);
		model.addAttribute("list", "发帖成功");
		System.out.println("发帖成功*************************");
		return "user/index";
	}

	/*
	 * 普通用户查看帖子
	 */
	@RequestMapping(value = "selectPost", method = RequestMethod.GET)
	@ResponseBody
	public Map<String, Object> selectPost(Model model, HttpSession session) {
		User u = (User) session.getAttribute(Constants.SESSION_USER);
		String user_id = u.getUser_id();
		System.out.println("获取到的id" + user_id);
		Map<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> mapList = new HashMap<String, Object>();
		List<Post> post = new ArrayList<Post>();
		List<Post> lists = new ArrayList<Post>();
		map.put("user_id", user_id);
		map.put("p_del_state", Constants.POST_TYPE_YOU);
		post = ordinarUserService.selectPost();

		for (int i = 0; i < post.size(); i++) {
			Post p = new Post();
			SimpleDateFormat ss = new SimpleDateFormat("yyyy-MM-dd");
			try {
				String dateNowStr = ss.format(ss.parse(post.get(i).getP_date()));
				p.setP_date(dateNowStr);
				p.setP_title(post.get(i).getP_title());
				p.setP_content(post.get(i).getP_content());
				p.setP_id(post.get(i).getP_id());
				lists.add(p);
			} catch (ParseException e) {
				e.printStackTrace();
			}

		}
		System.out.println("找到的帖子个数" + post);
		mapList.put("list", lists);
		return mapList;
	}

	/*
	 * 普通用户修改帖子*
	 */
	@RequestMapping(value = "updatePost", method = RequestMethod.GET)
	public String selectPost(Model model, HttpSession session, Post post) {

		System.out.println("需要修改的标题：" + post.getP_title());
		System.out.println("需要修改的内容：" + post.getP_content());
		System.out.println("需要修改的类别：" + post.getPt_id());

		ordinarUserService.updateAreaUser(post);
		System.out.println("修改后的帖子" + post);
		model.addAttribute("list", "修改成功");
		return "";
	}

	/*
	 * 普通用户删除帖子
	 */
	@RequestMapping(value = "delectPost", method = RequestMethod.GET)
	public String delectPost(Model model, String user_id) {
		List<Post> list = new ArrayList<Post>();
		Post post = new Post();
		post.setUser_id(user_id);
		list.add(post);
		ordinarUserService.delectPost(list);
		model.addAttribute("list", "删除成功");
		return "";
	}

	/*
	 * 普通用户评论帖子
	 */
	@RequestMapping(value = "addPost", method = RequestMethod.POST)
	public String addPost(HttpSession session, Comment com, Model model) {
		User u = (User) session.getAttribute(Constants.SESSION_USER);
		String user_id = u.getUser_id();
		com.setUser_id(user_id);
		ordinarUserService.addPost(com);
		System.out.println("添加的内容为" + com);
		News news = new News();
		Post post = new Post();
		post = helpservice.selectTitleByID(com.getP_id());
		news.setP_id(com.getP_id());
		news.setUser_id(user_id);
		news.setN_title(post.getP_title());
		news.setN_type(Constants.Post_User_Comment);
		ordinarUserService.addDiagram(news);
		model.addAttribute("list", "添加成功");
		System.out.println("查看用户帖子下的的评论***********" + com);

		return "redirect:findComment?p_id=" + com.getP_id();
	}

	/*
	 * 普通用户查看评论
	 */
	@RequestMapping(value = "findComment", method = RequestMethod.GET)
	public String findComment(String p_id, Model model) {

		Map<String, Object> map = new HashMap<String, Object>();

		map.put("p_id", p_id);

		List<UserVo> list = ordinarUserService.selectComment(map);
		model.addAttribute("list", list);
		System.out.println("查看用户帖子下的的评论，回复，用户信息***********" + list);
		return "user/postDetail";
	}

	/*
	 * 普通用户回复帖子
	 */
	@RequestMapping(value = "commentReply", method = RequestMethod.POST)
	public String commentReply(Model model, Reply rep, HttpSession session, String p_id) {
		User u = (User) session.getAttribute(Constants.SESSION_USER);
		String user_id = u.getUser_id();
		rep.setUser_id(user_id);
		
		ordinarUserService.addReply(rep);
        
		System.out.println("评论为*********:" + rep);
		return "redirect:findComAndRep?p_id="+p_id;
	}

	/*
	 * 普通用户查看帖子，评论，回复
	 */
	@RequestMapping(value = "findPost", method = RequestMethod.GET)
	public String findPost(Model model, UserVo uservo) {

		Map<String, Object> map = new HashMap<String, Object>();
		List<UserVo> list = new ArrayList<UserVo>();
		String p_id = uservo.getP_id();
		map.put("p_id", p_id);
		map.put("p_del_state", Constants.POST_TYPE_YOU);

		list = ordinarUserService.selectUserPost(map);
		model.addAttribute("list", list);
		System.out.println("查找到的帖子以及回复*****:" + list);

		return "user/login";
	}

	/*
	 * 普通用户图片上传
	 */
	@RequestMapping(value = "addPhoto", method = RequestMethod.GET)
	public String addPhoto(Model model, MultipartFile permitsfile, HttpServletRequest request,Post_img pi ) {

		boolean flag = UploadUtil.YzImgType(permitsfile);
		
		if (flag == false) {
			System.out.println("in");
			model.addAttribute("error", "文件格式错误!");
			return "redirect:user/login";
		}
		System.out.println("out");
		String filepath = request.getServletContext().getRealPath(Constants.UPLOAD_USER_SINESSLICENSES_PATH);

		System.out.println("图片的文件夹*******" + filepath);
		

		ordinarUserService.addPhotoPost(pi, permitsfile, filepath);

		model.addAttribute("list", "图片添加成功");
		return "user/login";
	}

	/*
	 * 普通用户点击帖子
	 */
	@RequestMapping(value = "userFindPost", method = RequestMethod.GET)
	public String userFindPost(Model model, String p_id, HttpSession session) {
		User u = (User) session.getAttribute(Constants.SESSION_USER);

		Map<String, Object> map = new HashMap<String, Object>();
		List<UserVo> post = new ArrayList<UserVo>();
		map.put("p_id", p_id);
		map.put("p_del_state", Constants.POST_TYPE_YOU);

		post = ordinarUserService.findOnePost(map);

		model.addAttribute("list", post);
		return "user/postDetail";
	}

	/*
	 * 普通用户查看评论，回复  
	 */ 
	@RequestMapping(value = "findComAndRep", method = RequestMethod.GET)
	public String findComAndRep(Model model, String p_id) {
		Map<String, Object> map = new HashMap<String, Object>();
		List<UserVo> list = new ArrayList<UserVo>();

		map.put("p_id", p_id);
		list = ordinarUserService.selectComAndRep(map);
		model.addAttribute("list", list);

		return "user/postDetail";
	}
	
	/*
	 * 
	 * 模糊搜索帖子
	 */
	@RequestMapping(value = "findPostByTitle", method = RequestMethod.POST)
	public String findPostByTitle(Model model,String p_title){
		
		Map<String,Object>   maps=new HashMap<String, Object>();
		List<UserVo>  post=new ArrayList<UserVo>();
		List<Post>  lists= new ArrayList<Post>();
		maps.put("p_title", p_title);
		post=ordinarUserService.selectPostByTitle(maps);
		for (int i = 0; i < post.size(); i++) {
			Post p = new Post();
			SimpleDateFormat ss = new SimpleDateFormat("yyyy-MM-dd");
			try {
				String dateNowStr = ss.format(ss.parse(post.get(i).getP_date()));
				p.setP_date(dateNowStr);
				p.setP_title(post.get(i).getP_title());
				p.setP_content(post.get(i).getP_content());
				p.setP_id(post.get(i).getP_id());
				lists.add(p);
			} catch (ParseException e) {
				e.printStackTrace();
				model.addAttribute("eror", "nofind");
			}
		}
		model.addAttribute("list", lists);
		return  "user/search_publish";
	}
	
	/*
	 * 点击更多帖子
	 */
	/*
	 * 普通用户查看帖子
	 */
	@RequestMapping(value = "selectMorePost", method = RequestMethod.GET)
	public String selectMorePost(Model model, HttpSession session) {
		User u = (User) session.getAttribute(Constants.SESSION_USER);
		String user_id = u.getUser_id();
		System.out.println("获取到的id" + user_id);
		Map<String, Object> map = new HashMap<String, Object>();
	
		List<Post> post = new ArrayList<Post>();
		List<Post> lists = new ArrayList<Post>();
		map.put("user_id", user_id);
		map.put("p_del_state", Constants.POST_TYPE_YOU);
		post = ordinarUserService.selectPost();

		for (int i = 0; i < post.size(); i++) {
			Post p = new Post();
			SimpleDateFormat ss = new SimpleDateFormat("yyyy-MM-dd");
			try {
				String dateNowStr = ss.format(ss.parse(post.get(i).getP_date()));
				p.setP_date(dateNowStr);
				p.setP_title(post.get(i).getP_title());
				p.setP_content(post.get(i).getP_content());
				p.setP_id(post.get(i).getP_id());
				lists.add(p);
			} catch (ParseException e) {
				e.printStackTrace();
			}

		}
		System.out.println("找到的帖子个数" + post);
		model.addAttribute("list", lists);
		
		return "user/most_post";
	}

}
