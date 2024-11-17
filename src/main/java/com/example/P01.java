package com.example;

import java.util.Random;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class P01 {
  public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    EntityManager em = emf.createEntityManager();
    Random random = new Random();

    // Addin Data to DB
    em.getTransaction().begin();
    for (int i = 0; i < 10; i++) {
      Alien a = new Alien(100 + i, "Name" + i, "Tech" + random.nextInt(10));
      em.persist(a);
    }
    em.getTransaction().commit();
    
    // Fetching Data
    Alien alien = em.find(Alien.class, 103);
    System.out.println(alien);

    // Updating Data
    alien.setName("Peter");
    em.getTransaction().begin();
    em.merge(alien);
    em.getTransaction().commit();

    // Deleting Data
    em.getTransaction().begin();
    alien = em.find(Alien.class, 100);
    em.remove(alien);
    em.getTransaction().commit();  

    em.close();
  }
}