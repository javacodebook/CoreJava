package com.learnjava.topic32.generics;

public class Store{
	
	private Book book;     // Problem :- The store can store only Books, here type is hard coded .

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Store [book=" + book + "]";
	}

	
	
	
}