package com.slby.model;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {

	private int id;
	private String usercode;
	private String password;
	private String username;
	private Date createtime;
	private String telephone;
	private String email;
	private String realname;
	private double leftmoney;
	private double usemoney;
	private int status;
	private int type;
	
	public User() {
		super();
	}

	public User(int id) {
		super();
		this.id = id;
	}

	public User(int id, String usercode, String password, String username, Date createtime, String telephone,
			String email, String realname, double leftmoney, double usemoney, int status, int type) {
		super();
		this.id = id;
		this.usercode = usercode;
		this.password = password;
		this.username = username;
		this.createtime = createtime;
		this.telephone = telephone;
		this.email = email;
		this.realname = realname;
		this.leftmoney = leftmoney;
		this.usemoney = usemoney;
		this.status = status;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsercode() {
		return usercode;
	}

	public void setUsercode(String usercode) {
		this.usercode = usercode;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public double getLeftmoney() {
		return leftmoney;
	}

	public void setLeftmoney(double leftmoney) {
		this.leftmoney = leftmoney;
	}

	public double getUsemoney() {
		return usemoney;
	}

	public void setUsemoney(double usemoney) {
		this.usemoney = usemoney;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", usercode=" + usercode + ", password=" + password + ", username=" + username
				+ ", createtime=" + createtime + ", telephone=" + telephone + ", email=" + email + ", realname="
				+ realname + ", leftmoney=" + leftmoney + ", usemoney=" + usemoney + ", status=" + status + ", type="
				+ type + "]";
	}
	
}
