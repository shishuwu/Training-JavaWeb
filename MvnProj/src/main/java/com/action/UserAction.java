package com.action;

public class UserAction {
	private String uname;
	
	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String toreg(){
		return "reg";
	}
	
	public String doreg(){
		System.out.println(uname);
		return "main";
	}
}
