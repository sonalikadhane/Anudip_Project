package com.lms.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.entities.TransactionDetails;
import com.lms.service.TransactionDetailsService;

@RestController
@RequestMapping("/api")
public class TransactionDetailsController {
	@Autowired
	TransactionDetailsService transactionservice;
	
	@PostMapping("/createTransaction")
	ResponseEntity<TransactionDetails> createTransactionDetails(@RequestBody TransactionDetails transaction )
	{
		return new ResponseEntity<TransactionDetails>(transactionservice.createTransactionDetails(transaction),HttpStatus.CREATED);
	}
	@GetMapping("/getAllTransaction")
	List<TransactionDetails>getAllTransactionDetails()
	{
		return transactionservice.getAllTransactionDetails();
		
	}
	@GetMapping("/getTransaction{bid}")
	TransactionDetails getTransactionDetailsId(@PathVariable("bid") int Bid)
	{
		return transactionservice.getTransactionDetailsById(Bid);
		
	}
	@DeleteMapping("/deleteTransactionr{bid}")
	String deleteTransactionDetailsById(@PathVariable("bid") int Bid)
	{
		return transactionservice.deleteTransactionDetailsById(Bid);
		
	
	}
}
