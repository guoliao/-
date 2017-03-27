package com.platform.entit;

public class Comment {
    /********评论表****************/
	private int     c_id;      //ID
	private String  c_content; //评论内容 
	private String  c_date;    //评论时间
	private String  p_id;      //帖子ID
	private String  user_id;   //评论人ID
	
	public Comment(){}

	public int getC_id() {
		return c_id;
	}

	public String getC_content() {
		return c_content;
	}

	public String getC_date() {
		return c_date;
	}

	public String getP_id() {
		return p_id;
	}

	public String getUser_id() {
		return user_id;
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

	public void setP_id(String p_id) {
		this.p_id = p_id;
	}

	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}

	@Override
	public String toString() {
		return "Comment [c_id=" + c_id + ", c_content=" + c_content + ", c_date=" + c_date + ", p_id=" + p_id
				+ ", user_id=" + user_id + "]";
	}

	
}
