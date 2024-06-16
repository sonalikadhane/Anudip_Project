package com.lms.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="book_details")

public class BookInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="bookdid",length =20)
	private int BId;
	@Column(name="bookname",length =30)
	private String Bname;
	@Column(name="bookauthor",length =30)
	private String author;
	@Column(name="bookquantity",length =30)
	private String quantity;

}
