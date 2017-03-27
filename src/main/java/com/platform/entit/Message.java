package com.platform.entit;

public class Message {
    
	/************留言**************/
	
	private String m_id;        //id
	private String m_content;   //内容
	private String m_date;      //时间
	private String user_id;     //留言人
	
    public Message(){}

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

public String getUser_id() {
	return user_id;
}

public void setUser_id(String user_id) {
	this.user_id = user_id;
}

@Override
public String toString() {
	return "t_message [m_id=" + m_id + ", m_content=" + m_content + ", m_date=" + m_date + ", user_id=" + user_id + "]";
}
  
 }
