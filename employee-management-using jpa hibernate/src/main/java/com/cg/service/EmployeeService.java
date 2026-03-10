package com.cg.service;

import java.util.List;
import java.util.Random;

import com.cg.bean.Employee;
import com.cg.dao.EmployeeDao;
import com.cg.dao.IEmployeeDao;

public class EmployeeService implements IEmployeeService {
	IEmployeeDao dao=new EmployeeDao();
	
	@Override
	public String createEmployee(Employee emp) {
		if(emp.getName()==null || emp.getName().length()<4 || emp.getEmail()==null ) {
			return "Invalid Employee Data";
		}
		else {
			Random r=new Random();
			String empid=emp.getName().substring(0,3)+r.nextInt(1000);
			int id=Integer.parseInt(empid);
			emp.setEmpid(id);
			return dao.saveEmployee(emp);
		}
	}

	@Override
	public Employee findById(int eid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateEmployeeName(int eid, String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String removeEmployee(int empid) {
		// TODO Auto-generated method stub
		return null;
	}

}
