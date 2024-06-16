package com.lms.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.lms.entity.AdminDetails;

public class AdminDetailsDAO {
    private static SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void saveAdmin(AdminDetails admin) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(admin);
        tx.commit();
        session.close();
    }

    public AdminDetails getAdminByUsername(String username) {
        Session session = factory.openSession();
        AdminDetails admin = session.createQuery("FROM AdminDetails WHERE username = :username", AdminDetails.class)
                .setParameter("username", username)
                .uniqueResult();
        session.close();
        return admin;
    }

}
