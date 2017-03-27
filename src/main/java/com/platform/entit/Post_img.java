package com.platform.entit;

public class Post_img {
    
	/**************关联图片*************/
	
	private int pi_id;       //id
	
	private String pi_img_name; //图片名称加后缀
	
	private String p_id;        //帖子ID
	
	public Post_img (){}




	public int getPi_id() {
		return pi_id;
	}




	public void setPi_id(int pi_id) {
		this.pi_id = pi_id;
	}




	public String getPi_img_name() {
		return pi_img_name;
	}

	public void setPi_img_name(String pi_img_name) {
		this.pi_img_name = pi_img_name;
	}

	public String getP_id() {
		return p_id;
	}

	public void setP_id(String p_id) {
		this.p_id = p_id;
	}




	@Override
	public String toString() {
		return "Post_img [pi_id=" + pi_id + ", pi_img_name=" + pi_img_name + ", p_id=" + p_id + "]";
	}

}
