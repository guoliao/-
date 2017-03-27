package com.platform.entit;

public class Post_type {
         
	
	/*******************帖子类别***************/
	
	private String pt_id;   //id
	private String pt_name; //类别名称
	
	public Post_type (){}

	public String getPt_id() {
		return pt_id;
	}

	public void setPt_id(String pt_id) {
		this.pt_id = pt_id;
	}

	public String getPt_name() {
		return pt_name;
	}

	public void setPt_name(String pt_name) {
		this.pt_name = pt_name;
	}

	@Override
	public String toString() {
		return "t_post_type [pt_id=" + pt_id + ", pt_name=" + pt_name + "]";
	}
	
	
}
