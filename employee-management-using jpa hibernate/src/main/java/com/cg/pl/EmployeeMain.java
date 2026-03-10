package com.cg.pl;

import java.util.List;

import com.cg.bean.Employee;
import com.cg.dao.EmployeeDao;
import com.cg.service.EmployeeService;
import com.cg.service.IEmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		IEmployeeService es=new EmployeeService();
		String result=es.createEmployee(new Employee("Rama", "ram@gmail.com", "1981-06-26"));
		System.out.println(result);
		
		EmployeeDao dao = new EmployeeDao();

		List<Employee> list = dao.getAll();

		for(Employee e : list) {
		    System.out.println(e.getEmpid() + " " +e.getName() + " " +e.getEmail());
		}
		
		

		String res2 = dao.updateEmployeeName(101, "Ritwik Sharma");

		System.out.println(result);

	}

}
