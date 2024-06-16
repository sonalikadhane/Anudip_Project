package com.lms.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.lms.entity.TransactionDetails;

import java.util.List;

public class TransactionDetailsDAO {
    private static SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void saveTransaction(TransactionDetails transaction) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(transaction);
        tx.commit();
        session.close();
    }

    public List<TransactionDetails> listTransactions() {
        Session session = factory.openSession();
        List<TransactionDetails> transactions = session.createQuery("FROM TransactionDetails", TransactionDetails.class).list();
        session.close();
        return transactions;
    }
}
