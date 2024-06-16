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

import com.lms.entities.BookInfo;
import com.lms.service.BookService;

@RestController
@RequestMapping("/api")
public class BookInfoController {
	@Autowired
	BookService bookService;
	@PostMapping("/createBook")
	ResponseEntity<BookInfo> createBookInfo(@RequestBody BookInfo book )
	{
		return new ResponseEntity<BookInfo>(bookService.createBookInfo(book),HttpStatus.CREATED);
	}
	@GetMapping("/getAllBook")
	List<BookInfo>getAllBookInfo()
	{
		return bookService.getAllBookInfo();
		
	}
	@GetMapping("/getBookInfo{bid}")
	BookInfo getBookInfoId(@PathVariable("bid") int Bid)
	{
		return bookService.getBookInfoById(Bid);
		
	}
	@DeleteMapping("/deleteBookInfo{bid}")
	String deleteBookInfoById(@PathVariable("bid") int Bid)
	{
		return bookService.deleteBookInfoById(Bid);
		
	
	}
	
}
