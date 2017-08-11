package com.slby.model;


public class Cloth{

	private int id;
	private String name;
	private double width;
	private double height;
	private int categoryid;
	private String province;
	private String number;
	private int status;
	
	
	public Cloth() {
		super();
	}


	public Cloth(int id, String name, double width, double height, int categoryid, String province, String number,
			int status) {
		super();
		this.id = id;
		this.name = name;
		this.width = width;
		this.height = height;
		this.categoryid = categoryid;
		this.province = province;
		this.number = number;
		this.status = status;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getWidth() {
		return width;
	}


	public void setWidth(double width) {
		this.width = width;
	}


	public double getHeight() {
		return height;
	}


	public void setHeight(double height) {
		this.height = height;
	}


	public int getCategoryid() {
		return categoryid;
	}


	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}


	public String getProvince() {
		return province;
	}


	public void setProvince(String province) {
		this.province = province;
	}


	public String getNumber() {
		return number;
	}


	public void setNumber(String number) {
		this.number = number;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Cloth [id=" + id + ", name=" + name + ", width=" + width + ", height=" + height + ", categoryid="
				+ categoryid + ", province=" + province + ", number=" + number + ", status=" + status + "]";
	}
	
	
}
