package com.platform.entit;

import java.util.Date;

public class Post {
         
	
	/*******************帖子********************/
	
	private String p_id;       //ID
	private String p_title;    //标题
	private String p_content;  //内容
	private String p_date;     //发布时间
	private int    p_level;    //权重（管理员是否置顶）
	private int    p_del_state;//删除状态（1 删除  2 在线）
	private String user_id;    //发布人ID
	private String    pt_id;      //所属类别
	
	public Post(){}

	public String getP_id() {
		return p_id;
	}

	public void setP_id(String p_id) {
		this.p_id = p_id;
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

	




	public int getP_level() {
		return p_level;
	}

	public void setP_level(int p_level) {
		this.p_level = p_level;
	}

	public int getP_del_state() {
		return p_del_state;
	}

	public void setP_del_state(int p_del_state) {
		this.p_del_state = p_del_state;
	}

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}




	public String getP_date() {
		return p_date;
	}

	public void setP_date(String p_date) {
		this.p_date = p_date;
	}

	public String getPt_id() {
		return pt_id;
	}

	public void setPt_id(String pt_id) {
		this.pt_id = pt_id;
	}

	@Override
	public String toString() {
		return "Post [p_id=" + p_id + ", p_title=" + p_title + ", p_content=" + p_content + ", p_date=" + p_date
				+ ", p_level=" + p_level + ", p_del_state=" + p_del_state + ", user_id=" + user_id + ", pt_id=" + pt_id
				+ "]";
	}

	

	
}
