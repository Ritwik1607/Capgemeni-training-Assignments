package com.cg.dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

import com.cg.bean.Employee;
import com.mysql.cj.protocol.Resultset;

public class EmployeeDao implements IEmployeeDao{
	private static Connection con;
	static {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/javapractice","root","ritwikcoder123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Override
	public String saveEmployee(Employee emp) {
		try {
			PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?)");
			ps.setString(1, emp.getEmpid());
			ps.setString(2, emp.getName());
			ps.setString(3, emp.getEmail());
			ps.setString(4, emp.getDob());
			int rows=ps.executeUpdate();
			if(rows>0)
				return "Employee Created";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Employee Not Created";
	}

	@Override
	public Employee findEmployee(int empid) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps=con.prepareStatement("select * from employee where empid=?");
			ps.setInt(empid, empid);
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				Employee emp = new Employee();

	            emp.setEmpid(rs.getInt("empid"));
	            emp.setName(rs.getString("name"));
	            emp.setEmail(rs.getString("email"));
	            emp.setDob(rs.getDate("dob").toString());

	            return emp;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Employee> getAll() {
		// TODO Auto-generated method stub
		List<Employee>emplist=new ArrayList<>();
		try {
			PreparedStatement ps=con.prepareStatement("select * from employee");
			
			ResultSet rs=ps.executeQuery();
			if(rs.next())
			{
				Employee emp=new Employee();
				emp.setEmpid(rs.getInt("empid"));
	            emp.setName(rs.getString("name"));
	            emp.setEmail(rs.getString("email"));
	            emp.setDob(rs.getDate("dob").toString());
	            
	            emplist.add(emp);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return emplist;
	}

	@Override
	public String updateEmployeeName(int empid, String newName) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps=con.prepareStatement("UPDATE employee SET name = ? WHERE empid = ?");
			
			ps.setString(1,newName);
			ps.setInt(2, empid);
			 int row=ps.executeUpdate();
			 
			 if(row>0)
				 return "Value is updated";
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "Update failed";
	}

	@Override
	public String deleteEmployee(String empid) {
		// TODO Auto-generated method stub
		
		try {
			PreparedStatement ps=con.prepareStatement("DELETE from employee WHERE empid = ?");
			ps.setInt(1, empid);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

}
