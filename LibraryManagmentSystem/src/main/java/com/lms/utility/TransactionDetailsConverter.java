package com.lms.utility;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.lms.entities.TransactionDetails;
import com.lms.model.TransactionDetailsDTO;

@Component
public class TransactionDetailsConverter {

	//convert DTO to Entity
			public TransactionDetails convertToTransactionDetailsEntity(TransactionDetailsDTO transactiondetailsDTO)
			{
				TransactionDetails transaction=new TransactionDetails();
				if(transactiondetailsDTO!=null)
				{
					BeanUtils.copyProperties(transactiondetailsDTO, transaction);
				}
				return transaction;
			}
			
			//Convert Entity to DTO
			public TransactionDetailsDTO convertToTransactionDetailsDTO(TransactionDetails transaction)
			{
				TransactionDetailsDTO transactiondetailsDTO=new TransactionDetailsDTO();
				if(transaction!=null)
				{
					BeanUtils.copyProperties(transaction, transactiondetailsDTO);
				}
				return transactiondetailsDTO;
			}

}
