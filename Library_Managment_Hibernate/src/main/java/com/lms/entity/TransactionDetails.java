package com.lms.entity;

import javax.persistence.*;

import java.util.Date;
@Entity
@Table(name = "transaction_details")
public class TransactionDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserDetails user;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private BookDetails book;

    @Column(name = "issueDate")
    private Date issueDate;
    

    @Column(name = "returnDate")
    private Date returnDate;

	public TransactionDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TransactionDetails(UserDetails user, BookDetails book, Date issueDate, Date returnDate) {
		super();
		this.user = user;
		this.book = book;
		this.issueDate = issueDate;
		this.returnDate = returnDate;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserDetails getUser() {
		return user;
	}

	public void setUser(UserDetails user) {
		this.user = user;
	}

	public BookDetails getBook() {
		return book;
	}

	public void setBook(BookDetails book) {
		this.book = book;
	}

	public Date getIssueDate() {
		return issueDate;
	}

	public void setIssueDate(Date issueDate) {
		this.issueDate = issueDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	@Override
	public String toString() {
		return "TransactionDetails [id=" + id + ", user=" + user + ", book=" + book + ", issueDate=" + issueDate
				+ ", returnDate=" + returnDate + "]";
	}

    
}
