package com.platform.entit;

public class Reply {
	
	/**************回复贴************/
	
         private int  r_id;      //ID
         private int  c_id;      //评论ID
         private String  r_content; //回复内容
         private String  user_id;   //回复人
         private String  r_date;    //回复时间
         
         public Reply (){}

		public int getR_id() {
			return r_id;
		}

		public int getC_id() {
			return c_id;
		}

		public void setR_id(int r_id) {
			this.r_id = r_id;
		}

		public void setC_id(int c_id) {
			this.c_id = c_id;
		}

		public String getR_content() {
			return r_content;
		}

		public void setR_content(String r_content) {
			this.r_content = r_content;
		}

		public String getUser_id() {
			return user_id;
		}

		public void setUser_id(String user_id) {
			this.user_id = user_id;
		}

		public String getR_date() {
			return r_date;
		}

		public void setR_date(String r_date) {
			this.r_date = r_date;
		}

		@Override
		public String toString() {
			return "Reply [r_id=" + r_id + ", c_id=" + c_id + ", r_content=" + r_content + ", user_id=" + user_id
					+ ", r_date=" + r_date + "]";
		}

		
         
         
} 
