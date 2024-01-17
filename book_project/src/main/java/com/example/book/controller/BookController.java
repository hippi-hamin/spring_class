package com.example.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.book.dto.BookDTO;
import com.example.book.service.BookService;

@Controller
public class BookController {
	@Autowired
	private BookService bookservice;
	
	// 도서등록 화면 출력
	@GetMapping("/save")
	public String save() {
		return "save";
	}
	
	// 도서등록 처리
	@PostMapping("/save")
	public String save(@ModelAttribute BookDTO bookDTO) {
		System.out.println("BookDTO = " + bookDTO);
		bookservice.save(bookDTO);
		return "index";
	}
}
