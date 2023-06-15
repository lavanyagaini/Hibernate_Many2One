package e1_manytoone_hibernate1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import e1_manytoone_hibernate1.dto.Company;
import e1_manytoone_hibernate1.dto.Employee;

public class CompanyCrud {

	public EntityManager getmanager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Lavanya");
		EntityManager manager = factory.createEntityManager();
		return manager;

	}

	public void saveCompany(Company company) {
		EntityManager manager = getmanager();
		EntityTransaction transaction=manager.getTransaction();
		transaction.begin();
		manager.persist(company);
		transaction.commit();
	}
	
	
	public void deleteCompany(int id) {
		EntityManager manager=getmanager();
		Company Company=manager.find(Company.class, id);
		if(Company!=null) {
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			manager.remove(Company);
			transaction.commit();
		}
		else
			System.out.println("Company object is not present");
				
	}
	
	
	

}
