package com.xh.commModule.entry;

import java.util.Date;

import org.hibernate.validator.constraints.NotBlank;

public class UserBean {
	/**
	 * 用户名
	 */
	@NotBlank(message = "{login.username.notblank}")
	private String username;

	/**
	 * 密码
	 */
	@NotBlank(message = "{login.password.notblank}")
	private String password;

	/**
	 * 验证码
	 */
	@NotBlank(message = "{login.code.notblank}")
	private String code;
	
	/*
		private String realname;
	    private String email;
	    private String mobilephone;
	    private String fixedPhone;
	    private String deptId;
	    private String corpId;
	    private String photoUrl;
	    private String note;
	    private Date createTime;
	    private Byte status;
	*/
	
	
	
	

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
}
