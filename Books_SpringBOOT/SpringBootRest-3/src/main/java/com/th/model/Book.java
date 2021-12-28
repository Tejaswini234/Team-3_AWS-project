package com.th.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	private int id_book;
	private String Bookname;
	private int book_price;
	
	public Book() {
		
	}

	public int getId_book() {
		return id_book;
	}

	public void setId_book(int id_book) {
		this.id_book = id_book;
	}

	public String getBookname() {
		return Bookname;
	}

	public void setBookname(String bookname) {
		Bookname = bookname;
	}

	public int getBook_price() {
		return book_price;
	}

	public void setBook_price(int book_price) {
		this.book_price = book_price;
	}

	public Book(int id_book, String bookname, int book_price) {
		super();
		this.id_book = id_book;
		Bookname = bookname;
		this.book_price = book_price;
	}

	@Override
	public String toString() {
		return "Book [id_book=" + id_book + ", Bookname=" + Bookname + ", book_price=" + book_price + "]";
	}

	
	
}