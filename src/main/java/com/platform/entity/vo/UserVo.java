package com.platform.entity.vo;

public class UserVo {  //普通用户权限
       
	/**********用户贴吧***************/
	
	private String user_id;    //用户名
	private String username;   //账号
	private String password;   //密码
	private String state;      //状态
	private String level;      //级别
	private String email;      //邮箱
	private String nickname;   //昵称
	private String address;    //地址
	private String phone;      //手机
	private String creat_date; //创建时间
	
    public UserVo()  {}

    /****************留言******************/

	private String m_id;        //id
	private String m_content;   //内容
	private String m_date;      //时间
	
	/**************消息 **********************/
	
	private String n_id;          // id
	private String n_title;       // 标题
	private String p_id;          // 帖子id
	private String n_date;        // 时间
	private String n_type;        // 消息类别 1帖子回复 2帖子被升级
	
	/**************帖子*************************/

	private String p_title;    //标题
	private String p_content;  //内容
	private String p_date;     //发布时间
	private String p_level;    //权重（管理员是否置顶）
	private String p_del_state;//删除状态（1 删除  2 在线）
	private String pt_id;      //所属类别
	
	/*************评论表***************************/
	
	private String  c_id;      //ID
	private String  c_content; //评论内容 
	private String  c_date;    //评论时间
 
	/*************回复表********************************/
	
	 private String  r_id;      //ID   
     private String  r_content; //回复内容 
     private String  r_date;    //回复时间
    /***************图片表********************************/ 
    private int pi_id;       //id	
 	private String pi_img_name; //图片名称加后缀 
 	/************帖子类别************************************/
 	private String pt_name; //类别名称	
	public String getPt_name() {
		return pt_name;
	}

	@Override
	public String toString() {
		return "UserVo [user_id=" + user_id + ", username=" + username + ", password=" + password + ", state=" + state
				+ ", level=" + level + ", email=" + email + ", nickname=" + nickname + ", address=" + address
				+ ", phone=" + phone + ", creat_date=" + creat_date + ", m_id=" + m_id + ", m_content=" + m_content
				+ ", m_date=" + m_date + ", n_id=" + n_id + ", n_title=" + n_title + ", p_id=" + p_id + ", n_date="
				+ n_date + ", n_type=" + n_type + ", p_title=" + p_title + ", p_content=" + p_content + ", p_date="
				+ p_date + ", p_level=" + p_level + ", p_del_state=" + p_del_state + ", pt_id=" + pt_id + ", c_id="
				+ c_id + ", c_content=" + c_content + ", c_date=" + c_date + ", r_id=" + r_id + ", r_content="
				+ r_content + ", r_date=" + r_date + ", pi_id=" + pi_id + ", pi_img_name=" + pi_img_name + ", pt_name="
				+ pt_name + "]";
	}

	public void setPt_name(String pt_name) {
		this.pt_name = pt_name;
	}

	public int getPi_id() {
		return pi_id;
	}

	public String getPi_img_name() {
		return pi_img_name;
	}

	public void setPi_id(int pi_id) {
		this.pi_id = pi_id;
	}

	public void setPi_img_name(String pi_img_name) {
		this.pi_img_name = pi_img_name;
	}

	public String getM_id() {
		return m_id;
	}

	public void setM_id(String m_id) {
		this.m_id = m_id;
	}

	public String getM_content() {
		return m_content;
	}

	public void setM_content(String m_content) {
		this.m_content = m_content;
	}

	public String getM_date() {
		return m_date;
	}

	public void setM_date(String m_date) {
		this.m_date = m_date;
	}

	public String getN_id() {
		return n_id;
	}

	public void setN_id(String n_id) {
		this.n_id = n_id;
	}

	public String getN_title() {
		return n_title;
	}

	public void setN_title(String n_title) {
		this.n_title = n_title;
	}

	public String getP_id() {
		return p_id;
	}

	public void setP_id(String p_id) {
		this.p_id = p_id;
	}

	public String getN_date() {
		return n_date;
	}

	public void setN_date(String n_date) {
		this.n_date = n_date;
	}

	public String getN_type() {
		return n_type;
	}

	public void setN_type(String n_type) {
		this.n_type = n_type;
	}

	public String getP_title() {
		return p_title;
	}

	public void setP_title(String p_title) {
		this.p_title = p_title;
	}

	public String getP_content() {
		return p_content;
	}

	public void setP_content(String p_content) {
		this.p_content = p_content;
	}

	public String getP_date() {
		return p_date;
	}

	public void setP_date(String p_date) {
		this.p_date = p_date;
	}

	public String getP_level() {
		return p_level;
	}

	public void setP_level(String p_level) {
		this.p_level = p_level;
	}

	public String getP_del_state() {
		return p_del_state;
	}

	public void setP_del_state(String p_del_state) {
		this.p_del_state = p_del_state;
	}

	public String getPt_id() {
		return pt_id;
	}

	public void setPt_id(String pt_id) {
		this.pt_id = pt_id;
	}

	public String getC_id() {
		return c_id;
	}

	public void setC_id(String c_id) {
		this.c_id = c_id;
	}

	public String getC_content() {
		return c_content;
	}

	public void setC_content(String c_content) {
		this.c_content = c_content;
	}

	public String getC_date() {
		return c_date;
	}

	public void setC_date(String c_date) {
		this.c_date = c_date;
	}

	public String getR_id() {
		return r_id;
	}

	public void setR_id(String r_id) {
		this.r_id = r_id;
	}

	public String getR_content() {
		return r_content;
	}

	public void setR_content(String r_content) {
		this.r_content = r_content;
	}

	public String getR_date() {
		return r_date;
	}

	public void setR_date(String r_date) {
		this.r_date = r_date;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCreat_date() {
		return creat_date;
	}

	public void setCreat_date(String creat_date) {
		this.creat_date = creat_date;
	}
}
