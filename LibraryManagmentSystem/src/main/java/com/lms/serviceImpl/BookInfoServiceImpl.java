package com.lms.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.lms.entities.BookInfo;

import com.lms.repository.BookInfoRepository;
import com.lms.service.BookService;

@Service
public class BookInfoServiceImpl  implements  BookService{
	
	@Autowired
	BookInfoRepository bookinfoRepository;
	@Override
	public BookInfo createBookInfo(BookInfo  book)
	{
		// TODO Auto-generated method stub
		return bookinfoRepository.save(book);
	}
    
	@Override
	public List<BookInfo> getAllBookInfo() {
		// TODO Auto-generated method stub
		return bookinfoRepository.findAll();
	}
	@Override
	public BookInfo getBookInfoById(int Bid) {
		// TODO Auto-generated method stub
		return bookinfoRepository.findById(Bid).get();
	}
	@Override
	public String deleteBookInfoById(int Bid) {
		// TODO Auto-generated method stub
		bookinfoRepository.deleteById(Bid);
		return "Book is deleted";
	}

	@Override
	public String updateBookInfoById(int Bid) {
		// TODO Auto-generated method stub
		return null;
	}
}
