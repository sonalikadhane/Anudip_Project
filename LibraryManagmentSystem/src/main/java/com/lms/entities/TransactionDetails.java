package com.lms.entities;



import java.sql.Date;

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
@Table(name="transaction_details")

public class TransactionDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="userid",length =20)
	private int Uid;
	@Column(name="adminid",length =20)
	private int AId;
	@Column(name="returndate",length =30)
	private Date Rdate;
	@Column(name="issuedate",length =30)
	private Date Idate;

}
