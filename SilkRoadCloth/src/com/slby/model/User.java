package com.slby.model;


public class User{

	private int id;
	private String username;
	private String password;
	private String name;
	private String telephone;
	private String email;
	private String realname;
	private double leftmoney;
	private double usemoney;
	private int status;
	private int type;
	private int role_id;
	
	public User() {
		super();
	}

	public User(int id) {
		super();
		this.id = id;
	}

	public User(int id, String username, String password, String name, String telephone, String email, String realname,
			double leftmoney, double usemoney, int status, int type, int role_id) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.name = name;
		this.telephone = telephone;
		this.email = email;
		this.realname = realname;
		this.leftmoney = leftmoney;
		this.usemoney = usemoney;
		this.status = status;
		this.type = type;
		this.role_id = role_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public int getRole_id() {
		return role_id;
	}

	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}

	
}
