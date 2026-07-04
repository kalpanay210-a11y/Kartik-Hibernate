package com.hbn.main;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hbn.configuration.HibernateConfig;
import com.hbn.entity.Address;
import com.hbn.entity.Employee;

public class Main {
	
	 public static void saveRecord(Session session) {
	    	
	    	Address add1 = new Address();
	        add1.setCity("Noida");
	        add1.setState("UP");
	        
	        Employee emp1 = new Employee();
	        
	        emp1.setEmp_name("Rehan");
	        emp1.setEmp_gender("Male");
	        emp1.setEmp_salary(30000);
	        emp1.setAddress(add1);
	        
	        add1.setEmployee(emp1);
	        
	        Transaction tx = session.beginTransaction();
	     
	        session.persist(emp1);
	        session.persist(add1);

	        
	        tx.commit();
	        
	    }
	
    public static void main(String[] args) {
    	
        
        Session session = HibernateConfig.getsessionFactory().openSession();

          saveRecord(session);
        
//        Employee employee = session.find(Employee.class, 2);
//        
//        System.out.println(employee);
//        System.out.println(employee.getAddress());

//        Address address = session.find(Address.class, 2);
//        
//        System.out.println(address);
//        System.out.println(address.getEmployee());
          
          
        
    }
}