package com.hbn.main;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hbn.configuration.HibernateConfig;
import com.hbn.entity.Address;
import com.hbn.entity.Employee;

public class Main {
    public static void main(String[] args) {
    	
    	Address add1 = new Address();
        add1.setCity("GZY");
        add1.setState("UP");
        
        Employee emp1 = new Employee();
        
        emp1.setEmp_name("Rehan");
        emp1.setEmp_gender("Male");
        emp1.setEmp_salary(30000);
        emp1.setAddress(add1);
        
        Session session = HibernateConfig.getsessionFactory().openSession();
        
        Transaction tx = session.beginTransaction();
     
        session.persist(emp1);
        session.persist(add1);

        
        tx.commit();
        
    }
}