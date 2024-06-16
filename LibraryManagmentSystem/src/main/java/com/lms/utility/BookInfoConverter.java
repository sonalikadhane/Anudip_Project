package com.lms.utility;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import com.lms.entities.BookInfo;
import com.lms.model.BookInfoDTO;


@Component
public class BookInfoConverter {
	//convert DTO to Entity
		public BookInfo convertToBookInfoEntity(BookInfoDTO bookinfoDTO)
		{
			BookInfo book=new BookInfo();
			if(bookinfoDTO!=null)
			{
				BeanUtils.copyProperties(bookinfoDTO, book);
			}
			return book;
		}
		
		//Convert Entity to DTO
		public BookInfoDTO convertToBookInfoDTO(BookInfo book)
		{
			BookInfoDTO bookinfoDTO=new BookInfoDTO();
			if(book!=null)
			{
				BeanUtils.copyProperties(book, bookinfoDTO);
			}
			return bookinfoDTO;
		}

}
