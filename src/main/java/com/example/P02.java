package com.example;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class P02 {
  public static void main(String[] args) {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu2");
    EntityManager em = emf.createEntityManager();

    em.getTransaction().begin();

    Animal animal = new Tiger(102, "Bob", "Ramsay Zoo");
    em.persist(animal);

    em.getTransaction().commit();
    em.close();
    emf.close();
  }
}
