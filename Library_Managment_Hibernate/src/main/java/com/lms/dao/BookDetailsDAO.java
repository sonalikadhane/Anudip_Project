package com.lms.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.lms.entity.BookDetails;

import java.util.List;

public class BookDetailsDAO {
    private static SessionFactory factory = new Configuration().configure().buildSessionFactory();

    public void saveBook(BookDetails book) {
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(book);
        tx.commit();
        session.close();
    }

    public List<BookDetails> listBooks() {
        Session session = factory.openSession();
        List<BookDetails> books = session.createQuery("FROM BookDetails", BookDetails.class).list();
        session.close();
        return books;
    }


}
