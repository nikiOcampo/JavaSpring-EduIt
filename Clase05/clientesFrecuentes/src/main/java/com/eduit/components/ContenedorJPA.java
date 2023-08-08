package com.eduit.components;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Component;

@Component
public class ContenedorJPA {
	
	private EntityManager entityManager;
	
	public ContenedorJPA() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("mariadb");
		entityManager = factory.createEntityManager();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

}
