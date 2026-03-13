package org.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

import java.time.LocalDate;

public class EmployeeMain {
    public static void main(String[] args) {
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("my-pu");
        EntityManager em= emf.createEntityManager();
        em.getTransaction().begin();

        PEmployee obj=new PEmployee();
        obj.setName("Saksham ");
        obj.setDob(LocalDate.of(2003,10,12));
        obj.setSalary(560000);
        em.persist(obj);

        CEmployee obj2=new CEmployee();
        obj2.setName("Ashtam ");
        obj2.setDob(LocalDate.of(2003,11,12));
        obj2.setPay_per_hour(1000);
        em.persist(obj2);
        em.getTransaction().commit();
        System.out.println("Created>>>>>>.............");

    }
}
