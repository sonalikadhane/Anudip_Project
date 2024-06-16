package com.lms.entity;

import java.util.List;

import com.lms.dao.AdminDetailsDAO;
import com.lms.dao.BookDetailsDAO;
import com.lms.dao.TransactionDetailsDAO;
import com.lms.dao.UserDetailsDAO;

public class LibraryService {

	    private AdminDetailsDAO adminDAO = new AdminDetailsDAO();
	    private UserDetailsDAO userDAO = new UserDetailsDAO();
	    private BookDetailsDAO bookDAO = new BookDetailsDAO();
	    private TransactionDetailsDAO transactionDAO = new TransactionDetailsDAO();

	    // Admin operations
	    public void addAdmin(AdminDetails admin) {
	        adminDAO.saveAdmin(admin);
	    }

	    public AdminDetails getAdminByUsername(String username) {
	        return adminDAO.getAdminByUsername(username);
	    }

	    // User operations
	    public void addUser(UserDetails user) {
	        userDAO.saveUser(user);
	    }

	    public UserDetails getUserByEmail(String email) {
	        return userDAO.getUserByEmail(email);
	    }

	    // Book operations
	    public void addBook(BookDetails book) {
	        bookDAO.saveBook(book);
	    }

	    public List<BookDetails> getAllBooks() {
	        return bookDAO.listBooks();
	    }

	    // Transaction operations
	    public void addTransaction(TransactionDetails transaction) {
	        transactionDAO.saveTransaction(transaction);
	    }

	    public List<TransactionDetails> getAllTransactions() {
	        return transactionDAO.listTransactions();
	    }

}
