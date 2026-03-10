package com.cg.department_employee;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int deptId;
	private String dname;
	@OneToMany(mappedBy = "dept", cascade = CascadeType.ALL)
	private List<Employee> emps;
	
	
	public Department() {
		
	}
	
	public Department(String dname) {
		super();
		this.dname = dname;
	}


	public int getDeptId() {
		return deptId;
	}


	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}


	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public List<Employee> getEmps() {
		return emps;
	}


	public void setEmps(List<Employee> emps) {
		this.emps = emps;
	}
	
	
	
	
	

}
