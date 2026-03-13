package com.cg.bean;

public class Employee {

	private int empid;
	private String name;
	private Address address;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void printEmployeeDetails() {
		System.out.println("Employee Id:"+empid);
		System.out.println("Employee Name:"+name);
		System.out.println("======Address=========");
		System.out.println("City:"+address.getCity());
		System.out.println("Country:"+address.getCountry());
		System.out.println("zip:"+address.getZip());

	}
}
