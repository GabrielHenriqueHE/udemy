package io.github.gabrielhenrique;

import io.github.gabrielhenrique.domain.Pessoa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aula-jpa");
        EntityManager entityManager = emf.createEntityManager();

        entityManager.getTransaction().begin();
        entityManager.remove(entityManager.find(Pessoa.class, 2));
        entityManager.getTransaction().commit();

        entityManager.close();
        emf.close();
    }
}