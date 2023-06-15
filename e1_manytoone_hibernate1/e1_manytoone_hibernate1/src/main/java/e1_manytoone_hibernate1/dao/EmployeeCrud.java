package e1_manytoone_hibernate1.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import e1_manytoone_hibernate1.dto.Company;
import e1_manytoone_hibernate1.dto.Employee;

public class EmployeeCrud {
	

	public EntityManager getmanager() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Lavanya");
		EntityManager manager = factory.createEntityManager();
		return manager;

	}
	
	
	public void saveEmployee(int id, Employee employee) {
		EntityManager manager=getmanager();
		EntityTransaction entityTransaction=manager.getTransaction();
		Company company=manager.find(Company.class, id);
		if(company!=null) {
		    employee.setCompany(company);
			entityTransaction.begin();
			manager.persist(employee);
			entityTransaction.commit();
			
			
			
		}else
			System.out.println("company object is not exist with the id ");
		
	
	}
	
	
	public void deleteEmployee(int id) {
		EntityManager manager=getmanager();
		Employee employee=manager.find(Employee.class, id);
		if(employee!=null) {
			EntityTransaction transaction=manager.getTransaction();
			transaction.begin();
			manager.remove(employee);
			transaction.commit();
		}
		else
			System.out.println("employee object is not present");
				
	}
	
	
	

}
