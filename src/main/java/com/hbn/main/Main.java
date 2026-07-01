package com.hbn.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbn.configuration.HibernateConfig;
import com.hbn.entity.Employee;

public class Main {
    public static void main(String[] args) {
        
        
        Employee emp = new Employee("Aman", "Male", "HYD", 25000);
        
        Session session = HibernateConfig.getsessionFactory().openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.persist(emp);
        
        tx.commit();
        
        System.out.println("🎉 Data successfully saved without any error!");
    }
}