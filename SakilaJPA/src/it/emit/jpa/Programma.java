package it.emit.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Programma {

	public static void main(String[] args) {
		EntityManagerFactory emf = 
				Persistence.createEntityManagerFactory("SakilaJPA");
		
		EntityManager em = emf.createEntityManager();	
		List<Attore> attori = 
				em.createQuery("select a from Attore a", Attore.class)
				.getResultList();
		for(Attore a : attori) {
			System.out.println(a.getNome() + " " +  a.getCognome());
		}
		
		Attore a = new Attore();
		a.setNome("Vittorio");
		a.setCognome("Gassman");
		
		em.getTransaction().begin();
		em.persist(a);
		em.getTransaction().commit();
		System.out.println("******");
		Attore johnny = em.find(Attore.class, 10);
		for(Film f : johnny.getCarriera()) {
			System.out.println(f.getTitle());
		}
		System.out.println("******");
		Film f = em.find(Film.class, 1);
		for(Attore y : f.getCast()) {
			System.out.println(y.getCognome());
		}

		em.close();
	}

}
