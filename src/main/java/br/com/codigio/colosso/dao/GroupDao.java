package br.com.codigio.colosso.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.codigio.colosso.model.Group;

public class GroupDao {
	private String PERSISTENCE_UNIT_NAME = "ColossoPU";
	
	@SuppressWarnings("unchecked")
	public List<Group> findAll() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager entityManager = emf.createEntityManager();
		List<Group> groups = new ArrayList<Group>();
		
		try {
            entityManager.getTransaction().begin();
            String qlQuery = "SELECT g FROM Group g";
            Query query = entityManager.createQuery(qlQuery);
            groups = query.getResultList();
            entityManager.getTransaction().commit();
        } finally {
            entityManager.close();
            emf.close();
        }
		
		return groups;
	}
}