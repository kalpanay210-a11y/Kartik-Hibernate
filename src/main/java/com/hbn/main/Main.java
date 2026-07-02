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
        
//     1)  Query query = session.createQuery("from Employee", Employee.class);
//       
//       List list = query.getResultList();
//       
//       System.out.println(list);
        
//      2)  Query query = session.createQuery("from Employee", Employee.class);
//        
//        query.setFirstResult(2);
//        query.setMaxResults(4);
//        
//        List list = query.getResultList();
//        
//        System.out.println(list);
        
//        MutationQuery query= session.createMutationQuery("update Employee set emp_name =:n where id =:i");
//        
//        query.setParameter("n", "Rohan");
//        
//        query.setParameter("i", 3);
//        
//        query.executeUpdate();
        
          MutationQuery query= session.createMutationQuery("delete from Employee where id =:i");
 
         query.setParameter("i", 7);
        
         query.executeUpdate();
         
         
         Query query1 = session.createQuery("from Employee", Employee.class);
         
         List list = query1.getResultList();
         
         System.out.println(list);
         
         
       
         tx.commit();
        
    }
}