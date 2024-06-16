package com.lms.service;

import java.util.List;

import com.lms.entities.TransactionDetails;


public interface TransactionDetailsService {
	TransactionDetails createTransactionDetails(TransactionDetails transaction);
	List<TransactionDetails>getAllTransactionDetails();
	TransactionDetails getTransactionDetailsById(int Bid);
	String deleteTransactionDetailsById(int Bid);
}
