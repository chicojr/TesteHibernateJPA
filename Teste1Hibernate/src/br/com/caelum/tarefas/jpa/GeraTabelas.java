package br.com.caelum.tarefas.jpa;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeraTabelas {
	
	public static void main(String[] args) {
		System.out.println("ok");
		try{
        EntityManagerFactory factory = Persistence.
        		createEntityManagerFactory("tarefas");
        factory.close();
		} catch (Exception e) {
		   e.printStackTrace();
		}
    }
	
}
