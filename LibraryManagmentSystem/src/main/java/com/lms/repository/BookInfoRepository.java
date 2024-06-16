package com.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.entities.BookInfo;


public interface BookInfoRepository extends JpaRepository<BookInfo,Integer>{

}
