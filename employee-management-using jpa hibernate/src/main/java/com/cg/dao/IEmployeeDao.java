package com.cg.dao;

import java.sql.Date;
import java.util.List;

import com.cg.bean.Employee;

public interface IEmployeeDao {
	public String saveEmployee(Employee emp);
	public Employee findEmployee(int empid);
	public List<Employee> getAll();
	public String updateEmployeeName(int empid, String newName);
	public String deleteEmployee(String empid);	
}
