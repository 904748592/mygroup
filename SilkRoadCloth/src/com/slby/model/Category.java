package com.slby.model;

public class Category {

	private int id;
	private String name;
	private double price;
	private int status;
	
	
	public Category() {
		super();
	}


	public Category(int id, String name, double price, int status) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
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


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public int getStatus() {
		return status;
	}


	public void setStatus(int status) {
		this.status = status;
	}


	@Override
	public String toString() {
		return "Category [id=" + id + ", name=" + name + ", price=" + price + ", status=" + status + "]";
	}
	
}
