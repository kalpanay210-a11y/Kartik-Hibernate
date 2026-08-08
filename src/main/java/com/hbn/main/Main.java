package com.hbn.main;

import java.util.ArrayList;
import java.util.List;


import org.hibernate.Session;

import org.hibernate.Transaction;

import com.hbn.configuration.HibernateConfig;
import com.hbn.entity.Address;
import com.hbn.entity.Employee;

public class Main {
	
	 public static void saveRecord(Session session) {
	    	
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
	        
	        Employee emp1 = new Employee("Sarita", "Female", 2400, 3434);
	        
	        
	        Transaction tx = session.beginTransaction();
	     
	        session.persist(emp1);

	        
	        tx.commit();
	        
	    }
	
    public static void main(String[] args) {
    	
        
        Session session = HibernateConfig.getsessionFactory().openSession();

          saveRecord(session);
          
          
        
    }
}