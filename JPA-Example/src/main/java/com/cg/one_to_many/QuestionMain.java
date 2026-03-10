package com.cg.one_to_many;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class QuestionMain {
	
	public static void main(String[] args) {
		EntityManagerFactory emf=  Persistence.createEntityManagerFactory("my-pu");
		EntityManager em = emf.createEntityManager();
		
		
//		Question q = new Question("What is API ?" , "M");
//		List<Answer> answers = new ArrayList<>(Arrays.asList(new Answer("Application programming interface " , q) , new Answer("hepls to connect frontend to backend " , q)));
//		q.setAnswer(answers);	
//		em.getTransaction().begin();
//		em.persist(q);
		
//		em.getTransaction().commit();
		
		
//		Question q = em.find(Question.class, 1);
//		
//		System.out.println(q);
//		
//		List<Answer> ans = q.getAnswer();
//		
//		System.out.println(ans);
		
		
		Answer ans = em.find(Answer.class, 2);
		
		System.out.println(ans.getQuestion());
		
		
		
	}

}
