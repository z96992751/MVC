package com.accp.t1.pojo;

import java.util.List;

public class Users {

	private String userName;

	private Integer userPwd;

	private List<String> ops;

	public Integer getUserPwd() {
		return userPwd;
	}

	public void setUserPwd(Integer userPwd) {
		this.userPwd = userPwd;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public List<String> getOps() {
		return ops;
	}

	public void setOps(List<String> ops) {
		this.ops = ops;
	}

	@Override
	public String toString() {
		return "Users [userName=" + userName + ", userPwd=" + userPwd + ", ops=" + ops + "]";
	}

	public Users(String userName, Integer userPwd, List<String> ops) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
		this.ops = ops;
	}

	public Users(String userName, Integer userPwd) {
		super();
		this.userName = userName;
		this.userPwd = userPwd;
	}

	public Users() {
		super();
	}
	
	
	

}
