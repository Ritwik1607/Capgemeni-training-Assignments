package com.cg.one_to_one;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PersonService {
	static EntityManagerFactory emf; 
	static EntityManager em ;
	
	static {
		emf = Persistence.createEntityManagerFactory("my-pu");
		em = emf.createEntityManager();
	}
	
	public static String savePerson(Person p ) {
		
		em.getTransaction().begin();
		
		em.persist(p);
		
		em.getTransaction().commit();
		
		return "Saved successfully";
	}
	
	public static Person getPersonById(int pid) {
		
		
		
		return em.find(Person.class, pid);
		
	}
	
	public static String updatePerson(int pid , String name) {
		
		em.getTransaction().begin();
		
		Person p = em.find(Person.class , pid);
		
		p.setName(name);
		
		em.persist(p);
		
		em.getTransaction().commit();
		
		return "successfully updated";
	}
	
	
	public static String deletePerson(int id) {
		
		em.getTransaction().begin();
		
		Person p = em.find(Person.class, id);
		
		em.remove(p);
		
		em.getTransaction().commit();
		
	    return "deleted successfully";
	}
	
	public static String updateDLType(int pid , String type) {
		em.getTransaction().begin();
		
		Person p = em.find(Person.class, pid);
		
		DL d = p.getDL();
		
		d.setType(type);
		
		em.getTransaction().commit();
		
		return "successfully updated";
		
	}
}
