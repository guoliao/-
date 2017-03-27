package com.platform.entit;

public class News {
   /*************消息******************/ 
	
	private int    n_id;          // id
	private String n_title;       // 标题
	private String p_id;          // 帖子id
	private String user_id;       // 用户id
	private String n_date;        // 时间
	private int    n_type;        // 消息类别 1帖子回复 2帖子被升级
	
	public News(){}

	

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

	public String getUser_id() {
		return user_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	public String getN_date() {
		return n_date;
	}

	public void setN_date(String n_date) {
		this.n_date = n_date;
	}



	public int getN_id() {
		return n_id;
	}



	public int getN_type() {
		return n_type;
	}



	public void setN_id(int n_id) {
		this.n_id = n_id;
	}



	public void setN_type(int n_type) {
		this.n_type = n_type;
	}



	@Override
	public String toString() {
		return "News [n_id=" + n_id + ", n_title=" + n_title + ", p_id=" + p_id + ", user_id=" + user_id + ", n_date="
				+ n_date + ", n_type=" + n_type + "]";
	}

	

	
	
}
