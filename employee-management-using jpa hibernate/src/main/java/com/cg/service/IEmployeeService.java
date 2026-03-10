package com.cg.service;

import java.util.List;

import com.cg.bean.Employee;

public interface IEmployeeService {
	public String createEmployee(Employee emp);
	public Employee findById(int eid);
	public List<Employee> getAllEmployee();
	public String updateEmployeeName(int eid,String name);
	public String removeEmployee(int empid);
}
