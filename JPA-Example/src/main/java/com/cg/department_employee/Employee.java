package com.cg.department_employee;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int eid;
	private String name;
	@ManyToOne
	@JoinColumn(name = "dept_id")
	private Department dept;
	
	
	public Employee() {
		
	}
	
	public Employee(String name , Department department) {
		super();
		this.name = name;
		this.dept = department;
		
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", dept=" + dept + "]";
	}


	

	
	
	
	
	
}
