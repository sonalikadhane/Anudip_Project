package com.lms.service;

import java.util.List;

import com.lms.entities.BookInfo;

public interface BookService {
	BookInfo createBookInfo(BookInfo book);
	List<BookInfo>getAllBookInfo();
	BookInfo getBookInfoById(int Bid);
	String deleteBookInfoById(int Bid);
	String updateBookInfoById(int Bid);


}
