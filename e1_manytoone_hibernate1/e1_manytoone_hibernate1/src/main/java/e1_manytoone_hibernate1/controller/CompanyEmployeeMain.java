package e1_manytoone_hibernate1.controller;

import e1_manytoone_hibernate1.dao.CompanyCrud;
import e1_manytoone_hibernate1.dao.EmployeeCrud;
import e1_manytoone_hibernate1.dto.Company;
import e1_manytoone_hibernate1.dto.Employee;

public class CompanyEmployeeMain {

	public static void main(String[] args) {
		
		
		CompanyCrud crud=new CompanyCrud();
		//saving company object
		Company company=new Company("TESTYENTRA", "ty@gmail.com", "Banglore", "Girish");
		
		crud.saveCompany(company);
		
		
		EmployeeCrud crud2=new EmployeeCrud();
		
		Employee e1=new Employee("RAMESH", "r@gmail.com", 345678, "123", "BTM");
		
		
		crud2.saveEmployee(1, e1);
		
		
		
		//crud.deleteCompany(1);
		
		//crud2.deleteEmployee(1);
		
	}

}
