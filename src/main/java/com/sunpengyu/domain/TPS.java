package com.sunpengyu.domain;

import java.util.Date;

public class TPS {

	private int id;
	private String name;
	private Integer age;
	private double price;
	private Date date;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "TPS [id=" + this.id + ", name=" + this.name + ", age=" + this.age + ", price=" + this.price + ", date="
				+ this.date + "]";
	}

}
