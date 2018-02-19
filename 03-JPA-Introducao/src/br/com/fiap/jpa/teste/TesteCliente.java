package br.com.fiap.jpa.teste;

import java.util.Calendar;
import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.fiap.jpa.entity.Cliente;
import br.com.fiap.jpa.entity.Sexo;
import br.com.fiap.jpa.entity.Status;

public class TesteCliente {

	public static void main(String[] args) {
		EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("oracle");
		EntityManager em = fabrica.createEntityManager();
		
		Cliente cliente = new Cliente("Vinicius Bispo", new GregorianCalendar(1998,Calendar.OCTOBER,15), 01, Sexo.MASCULINO, null, Status.ATIVO);
		
		
		em.getTransaction().begin(); //inicializa uma transação
		em.persist(cliente);
		em.getTransaction().commit(); //realiza o commit
		
		em.close();
		fabrica.close();
	}

}
