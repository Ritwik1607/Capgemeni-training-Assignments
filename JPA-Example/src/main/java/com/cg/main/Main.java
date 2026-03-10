package com.cg.main;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

import com.cg.entity.Product;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;

public class Main {
	
	public static void main(String[] args) {
		List<Product> prods  = new ArrayList<>();
		prods.add(new Product("Iphone 17" , 125000 , 5 , LocalDate.of(2025, 11, 16)));
		prods.add(new Product( "Dell" , 127000 , 2 , LocalDate.of(2025, 9, 16)));
		prods.add(new Product( "HP" , 175000 , 6 , LocalDate.of(2025, 12, 16)));
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		
		tx.begin();
		for(Product p : prods) {
			em.persist(p);
		}
		tx.commit();
		System.out.println("created");
		
//		Query q = em.createQuery("select p from Product p");
//		
//		List<Product> l = q.getResultList();
//		
//		System.out.println(l);
		
	}
}
