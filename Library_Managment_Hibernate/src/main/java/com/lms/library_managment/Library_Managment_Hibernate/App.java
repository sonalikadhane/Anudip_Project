package com.lms.library_managment.Library_Managment_Hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.lms.entity.AdminDetails;
import com.lms.entity.BookDetails;
import com.lms.entity.LibraryService;
import com.lms.entity.TransactionDetails;
import com.lms.entity.UserDetails;

/**
 * Hello world!
 *
 */

         public class App {
             public static void main(String[] args) {
                 // Initialize Hibernate session factory
                 SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
                 System.out.println("Hibernate session factory initialized!");

                 // Example usage:
                 LibraryService libraryService = new LibraryService();

                 // Add an admin
                 AdminDetails admin = new AdminDetails();
                 admin.setUsername("admin");
                 admin.setPassword("admin123");
                 admin.setEmail("admin@example.com");
                 libraryService.addAdmin(admin);

                 // Add a user
                 UserDetails user = new UserDetails();
                 user.setName("sona");
                 user.setEmail("sona@example.com");
                 user.setPassword("1234");
                 libraryService.addUser(user);

                 // Add a book
                 BookDetails book = new BookDetails();
                 book.setTitle("Effective Java");
                 book.setAuthor("Joshua Bloch");
                 book.setPublisher("Addison-Wesley");
                 book.setIsbn("978-0134685991");
                 book.setAvailableCopies(5);
                 libraryService.addBook(book);

                 // Issue a book to a user
                 TransactionDetails transaction = new TransactionDetails();
                 transaction.setUser(user);
                 transaction.setBook(book);
                 transaction.setIssueDate(new java.util.Date());
                 libraryService.addTransaction(transaction);

                 // Display all books
                 System.out.println("Books in the library:");
                 for (BookDetails b : libraryService.getAllBooks()) {
                     System.out.println(b.getTitle() + " by " + b.getAuthor());
                 }

                 // Close session factory
                 sessionFactory.close();
             }
         }


   
