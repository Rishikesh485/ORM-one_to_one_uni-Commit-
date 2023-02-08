package com.jsp.person.pan.aadhar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestDriver {

	public static void main(String[] args) {
		// table bnaega isse
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("rishi");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		//

		// value set krenge hum either
		Pan pan = new Pan();
		pan.setPan_number(12121214);

		Aadhar aadhar = new Aadhar();
		aadhar.setAadhar_number(151818151);

		Person person = new Person();
		person.setName("abc");
		person.setEmail("abc@gmail.com");
		person.setAadhar(aadhar);
		person.setPan(pan);
		// $$

		// database me add hoga
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(aadhar); // persist hum issi l;iye use krte hai taaki table me value ghusse
		entityManager.persist(pan);
		entityTransaction.commit(); // save ho jaata hai isse
		System.out.println("all good");

	}
}
