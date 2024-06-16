package com.lms.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.lms.entity.UserDetails;

public class UserDetailsDAO {
    private static SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void saveUser(UserDetails user) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(user);
        tx.commit();
        session.close();
    }

    public UserDetails getUserByEmail(String email) {
        Session session = factory.openSession();
        UserDetails user = session.createQuery("FROM UserDetails WHERE email = :email", UserDetails.class)
                .setParameter("email", email)
                .uniqueResult();
        session.close();
        return user;
    }

   
}
