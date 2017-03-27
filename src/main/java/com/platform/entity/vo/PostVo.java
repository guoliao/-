package com.platform.entity.vo;

public class PostVo {   //发帖
   
	/*****************帖子***************/	
	private String p_id;       //ID
	private String p_title;    //标题
	private String p_content;  //内容
	private String p_date;     //发布时间
	private int    p_level;    //权重（管理员是否置顶）
	private int    p_del_state;//删除状态（1 删除  2 在线）
	private String user_id;    //发布人ID
	private String    pt_id;      //所属类别
	/*******************用户列表****************/
	private String username;   //账号
	private String password;   //密码
	private int state;      //状态
	private int level;      //级别
	private String email;      //邮箱
	private String nickname;   //昵称
	private String address;    //地址
	private String phone;      //手机
	private String creat_date; //创建时间
	/**************评论表**************************/	
	private int     c_id;      //ID
	private String  c_content; //评论内容 
	private String  c_date;    //评论时间	
	/*******************帖子类别 *****************/
	private String pt_name; //类别名称	
	/*********************关联图片******************/
    private int pi_id;       //id	
	private String pi_img_name; //图片名称加后缀
	/**************回复表***************************/
	 private String  r_id;      //ID   
     private String  r_content; //回复内容 
     private String  r_date;    //回复时间
     
	public String getR_id() {
		return r_id;
	}
	public String getR_content() {
		return r_content;
	}
	public String getR_date() {
		return r_date;
	}
	public void setR_id(String r_id) {
		this.r_id = r_id;
	}
	public void setR_content(String r_content) {
		this.r_content = r_content;
	}
	public void setR_date(String r_date) {
		this.r_date = r_date;
	}
	public  PostVo(){}
	public String getP_id() {
		return p_id;
	}
	public String getP_title() {
		return p_title;
	}
	public String getP_content() {
		return p_content;
	}
	public String getP_date() {
		return p_date;
	}
	public int getP_level() {
		return p_level;
	}
	public int getP_del_state() {
		return p_del_state;
	}
	public String getUser_id() {
		return user_id;
	}
	public String getPt_id() {
		return pt_id;
	}
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public int getState() {
		return state;
	}
	public int getLevel() {
		return level;
	}
	public String getEmail() {
		return email;
	}
	public String getNickname() {
		return nickname;
	}
	public String getAddress() {
		return address;
	}
	public String getPhone() {
		return phone;
	}
	public String getCreat_date() {
		return creat_date;
	}
	public int getC_id() {
		return c_id;
	}
	public String getC_content() {
		return c_content;
	}
	public String getC_date() {
		return c_date;
	}
	public String getPt_name() {
		return pt_name;
	}
	public int getPi_id() {
		return pi_id;
	}
	public String getPi_img_name() {
		return pi_img_name;
	}
	public void setP_id(String p_id) {
		this.p_id = p_id;
	}
	public void setP_title(String p_title) {
		this.p_title = p_title;
	}
	public void setP_content(String p_content) {
		this.p_content = p_content;
	}
	public void setP_date(String p_date) {
		this.p_date = p_date;
	}
	public void setP_level(int p_level) {
		this.p_level = p_level;
	}
	public void setP_del_state(int p_del_state) {
		this.p_del_state = p_del_state;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public void setPt_id(String pt_id) {
		this.pt_id = pt_id;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setState(int state) {
		this.state = state;
	}
	public void setLevel(int level) {
		this.level = level;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setCreat_date(String creat_date) {
		this.creat_date = creat_date;
	}
	public void setC_id(int c_id) {
		this.c_id = c_id;
	}
	public void setC_content(String c_content) {
		this.c_content = c_content;
	}
	public void setC_date(String c_date) {
		this.c_date = c_date;
	}
	public void setPt_name(String pt_name) {
		this.pt_name = pt_name;
	}
	public void setPi_id(int pi_id) {
		this.pi_id = pi_id;
	}
	public void setPi_img_name(String pi_img_name) {
		this.pi_img_name = pi_img_name;
	}
	@Override
	public String toString() {
		return "PostVo [p_id=" + p_id + ", p_title=" + p_title + ", p_content=" + p_content + ", p_date=" + p_date
				+ ", p_level=" + p_level + ", p_del_state=" + p_del_state + ", user_id=" + user_id + ", pt_id=" + pt_id
				+ ", username=" + username + ", password=" + password + ", state=" + state + ", level=" + level
				+ ", email=" + email + ", nickname=" + nickname + ", address=" + address + ", phone=" + phone
				+ ", creat_date=" + creat_date + ", c_id=" + c_id + ", c_content=" + c_content + ", c_date=" + c_date
				+ ", pt_name=" + pt_name + ", pi_id=" + pi_id + ", pi_img_name=" + pi_img_name + ", r_id=" + r_id
				+ ", r_content=" + r_content + ", r_date=" + r_date + "]";
	}



	
}
