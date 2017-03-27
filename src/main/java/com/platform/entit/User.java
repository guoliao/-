package com.platform.entit;

import java.util.Date;

public class User {
    
	/****************用户*********************/
	
	private String user_id;    //用户名
	private String username;   //账号
	private String password;   //密码
	private int state;      //状态
	private int level;      //级别
	private String email;      //邮箱
	private String nickname;   //昵称
	private String address;    //地址
	private String phone;      //手机
	private String creat_date; //创建时间
	
    public  User() {}

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

	public int getState() {
		return state;
	}

	public int getLevel() {
		return level;
	}

	
	public void setState(int state) {
		this.state = state;
	}

	public String getCreat_date() {
		return creat_date;
	}

	public void setCreat_date(String creat_date) {
		this.creat_date = creat_date;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", username=" + username + ", password=" + password + ", state=" + state
				+ ", level=" + level + ", email=" + email + ", nickname=" + nickname + ", address=" + address
				+ ", phone=" + phone + ", creat_date=" + creat_date + "]";
	}

	

	
	

}
