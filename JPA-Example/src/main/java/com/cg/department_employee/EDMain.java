package com.cg.department_employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EDMain {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		
		
		
		Department d = new Department("HR");
		
		List<Employee> emps = new ArrayList<>(Arrays.asList( new Employee("smith" , d)  ,new Employee("ramsy" , d) , new Employee("manisha" , d)));
		d.setEmps(emps);
		
		Department d1 = new Department("SALES");
		List<Employee> emps1 = new ArrayList<>(Arrays.asList( new Employee("rahul" , d1)  ,new Employee("rabena" , d1) , new Employee("rajnesh" , d1)));
		d1.setEmps(emps1);
		
		em.getTransaction().begin();
		
		em.persist(d1);
		
		em.getTransaction().commit();
		
	}

}
