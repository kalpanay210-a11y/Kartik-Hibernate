package com.hbn.main;

import java.util.ArrayList;


import org.hibernate.Session;

import org.hibernate.Transaction;

import com.hbn.configuration.HibernateConfig;
import com.hbn.entity.Address;
import com.hbn.entity.Employee;

public class Main {
	
	 public static void saveRecord(Session session) {
		 Transaction tx = session.beginTransaction();
	    	
	    	Address add1 = new Address();
	        add1.setCity("Noida");
	        add1.setState("UP");
	        
	        Address add2 = new Address();
	        add2.setCity("GYB");
	        add2.setState("UP");
	        
	        Address add3 = new Address();
	        add3.setCity("Gurgaon");
	        add3.setState("HR");
	        
	        ArrayList<Address> listOfAdd = new ArrayList<>();
	        
	        listOfAdd.add(add1);
	        listOfAdd.add(add2);
	        listOfAdd.add(add3);
	        
	        Employee emp1 = new Employee();
	        
	        emp1.setEmp_name("Ridhima");
	        emp1.setEmp_gender("Feale");
	        emp1.setEmp_salary(30000);
	        emp1.setAddress(listOfAdd);
	        
	        add1.setEmployee(emp1);
	        add1.setEmployee(emp1);
	        add1.setEmployee(emp1);
	        
	        
	        session.persist(emp1);

	        
	        tx.commit();
	        
	    }
	
    public static void main(String[] args) {
    	
        
        Session session = HibernateConfig.getsessionFactory().openSession();

          saveRecord(session);
      
//        Employee employee = session.find(Employee.class, 1);
//        System.out.println(employee);
          
          Address address = session.find(Address.class, 1);
          System.out.println(address);
          System.out.println(address.getEmployee());
//          
          
        
    }
}