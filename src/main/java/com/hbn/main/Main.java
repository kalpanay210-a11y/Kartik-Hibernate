package com.hbn.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.hbn.entity.Employee;

public class Main {
    public static void main(String[] args) {
        
        // 1. Configuration aur SessionFactory initialize karein
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        // 2. Naya Employee object banayein
        Employee emp = new Employee("Aman", "Male", 25000, "GYZ");
        
        // 3. Session open karein aur Transaction shuru karein
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        // 4. Object ko database mein save karein
        session.persist(emp); // Note: Agar purana hibernate ho toh session.save(emp); likhein
        
        // 5. Transaction commit karein (Yahan tak code sahi chala toh data permanent save ho jayega)
        tx.commit();
        System.out.println("Data successfully saved!");
        
        // 6. Resources close karein
        session.close();
        factory.close();
    }
}