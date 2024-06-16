package com.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.entities.TransactionDetails;



public interface TransactionDetailsRepository extends JpaRepository<TransactionDetails,Integer> {

}
