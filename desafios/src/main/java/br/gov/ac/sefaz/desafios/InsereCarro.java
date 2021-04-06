package br.gov.ac.sefaz.desafios;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class InsereCarro {

	public static void main(String[] args) {
		// Todas as operações de busca ou de alteração vão nascer com a instância da classe
		
		//Insereindo no banco 
		 EntityManagerFactory entityManagerFactory =
		 Persistence.createEntityManagerFactory("Carro2"); 
		 EntityManager entityManager  = entityManagerFactory.createEntityManager();
		 
		 // Insereindo no banco 
		 EntityTransaction tx = entityManager.getTransaction(); 
		 // inicia 
		 tx.begin();
		 //faz instanciamento da classe carro
		 Carro2 carro2 = new Carro2();
		 
		 carro2.setNome("Prisma");
		 carro2.setPortas(4);
		 // emiti mensagem de inserção 
		 entityManager.persist(carro2);
		 // confirma a inserção no banco de dados 
		 tx.commit();
		 
		 entityManager.close(); 
		 entityManagerFactory.close();
		 
		 /*
		 
		 Busca la no banco 
		EntityManagerFactory entityManagerFactoryB = Persistence.createEntityManagerFactory("Carro");
		EntityManager entityManagerager = entityManagerFactoryB.createEntityManager();

		Carro2 carro2 = entityManager.find(Carro2.class, 1);
		System.out.println(carro.getNome());

		entityManager.close();
		entityManagerFactoryB.close();

		
		
		
		// alteração n banco
		EntityManagerFactory entityManagerFactoryA = Persistence.createEntityManagerFactory("Clientes-PU");
		EntityManager entityManagerA = entityManagerFactoryA.createEntityManager();

		entityManagerA.getTransaction().begin();
		// Código de alteração aqui
		entityManagerA.getTransaction().commit();

		entityManagerA.close();
		entityManagerFactoryA.close();
*/
	}

}
