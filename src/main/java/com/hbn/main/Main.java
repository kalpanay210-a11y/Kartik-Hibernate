package com.hbn.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbn.configuration.HibernateConfig;
import com.hbn.entity.Employee;

public class Main {
    public static void main(String[] args) {
        
        
        Employee emp1 = new Employee("Aman", "Male", "HYD", 25000);
        
        
        Session session = HibernateConfig.getsessionFactory().openSession();
        
        Transaction tx = session.beginTransaction();
        
        session.load(emp1, 3);
        
        System.out.println(emp1);
        
//        Employee employee = session.get(Employee.class, 3);
//        
//        System.out.println(employee);
        
        tx.commit();
        
    }
}