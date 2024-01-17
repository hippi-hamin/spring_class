package com.example.book.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data // Getter, Setter, ToString 전부 포함
@Getter
@Setter
@ToString
public class BookDTO {
	private Long id;
	private String bookName;
	private String bookAuthor;
	private String bookPublisher;
	private int bookPrice;
}
