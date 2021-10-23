package com.test;

public class Employee {

	private int id;
	private String name;
	private double marks;
	private String address;

	public Employee() {
		System.out.println("def cons");
	}

	public Employee(int id) {
		this.id = id;
		System.out.println("Employee(int id)");
	}

	public Employee(String name) {
		this.name = name;
		System.out.println("Employee(String str)");
	}

	public Employee(int id, String name, double marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		System.out.println("Employee(int id, String name, double marks, String address)");
	}

	public void setMarks(double tmp) {
		marks = tmp;
	}

	public double getMarks() {
		return marks;
	}

	public Employee(String name, int id) {
		this.id = id;
		this.name = name;
		System.out.println("Check Employee(int id, String name)");
	}

	public void setName(String name) {
		this.name = name;
		System.out.println("setName(String name)");
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	void show() {
		System.out.println("id=" + id + ", name=" + name + ", marks=" + marks + ", address=" + address);
	}

}
