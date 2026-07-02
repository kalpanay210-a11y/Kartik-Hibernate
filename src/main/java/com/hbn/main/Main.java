package com.hbn.main;

import java.util.List;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.hbn.configuration.HibernateConfig;
import com.hbn.entity.Employee;

public class Main {
    public static void main(String[] args) {
        
        
        Employee emp1 = new Employee("Aman", "Male", "HYD", 25000);
        
        
        Session session = HibernateConfig.getsessionFactory().openSession();
        
        Transaction tx = session.beginTransaction();
     
        
        Query query = session.createNamedQuery("findById", Employee.class);
         
        query.setParameter("id", 6);
        
        List list =  query.getResultList();
        
        System.out.println(list);
        
        System.out.println("---------------------------------");
        
        Query query2 = session.createNamedQuery("findByGender", Employee.class);
         
        query2.setParameter("gender", "Male");
        
        List list2 = query2.getResultList();
        
        System.out.println(list2);
        
        tx.commit();
        
    }
}