package com.lms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.entities.TransactionDetails;
import com.lms.repository.TransactionDetailsRepository;
import com.lms.service.TransactionDetailsService;
@Service
public class TransactionDetailsServiceImpl implements TransactionDetailsService{
	
	@Autowired
	TransactionDetailsRepository transactiondetailsRepository;
	
	@Override
	public TransactionDetails createTransactionDetails(TransactionDetails transaction) {
		// TODO Auto-generated method stub
		return transactiondetailsRepository.save(transaction);
	}

	@Override
	public List<TransactionDetails> getAllTransactionDetails() {
		// TODO Auto-generated method stub
		return transactiondetailsRepository.findAll();
	}

	@Override
	public TransactionDetails getTransactionDetailsById(int Bid) {
		// TODO Auto-generated method stub
		return transactiondetailsRepository.findById(Bid).get();
	}

	@Override
	public String deleteTransactionDetailsById(int Bid) {
		// TODO Auto-generated method stub
		transactiondetailsRepository.deleteById(Bid);
		return "Transaction is deleted";
	}
}
