package br.com.fiap.jpa.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Carro;
import br.com.fiap.jpa.entity.Transmissao;

class Teste {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		
		Carro carro = new Carro("Ferrari", 2015 , "2.0 turbo", "Ferrari", "ABC-1234", new GregorianCalendar(2015,Calendar.FEBRUARY,2), false,
				false, null, Transmissao.AUTOMATICA);
		
		em.getTransaction().begin(); //inicializa uma transação
		em.persist(carro);
		em.getTransaction().commit(); //realiza o commit
		
		em.close();
		fabrica.close();
	}

}
