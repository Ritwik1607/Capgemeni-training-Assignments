package com.cg.many_to_many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class StudentMain {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		
		Course c1 = new Course("java");
		Course c2 = new Course("python");
		
		
		Set<Course> li = Set.of(new Course("java") , new Course("spring"));
		
		
		Student s = new Student("Rahul");
		
		List<Student> students = new ArrayList<>(Arrays.asList(new Student("Rahul") , new Student("Ram")));
		s.setCourses(li);
		
		
		
		
		
		em.getTransaction().begin();
		
		Course c = em.find(Course.class, 102);
		c.setStudents(students);
//		em.persist(c1);
		em.getTransaction().commit();
	}
}
