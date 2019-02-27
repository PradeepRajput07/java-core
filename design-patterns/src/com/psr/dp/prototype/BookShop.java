package com.psr.dp.prototype;

import java.util.ArrayList;
import java.util.List;

public class BookShop implements Cloneable {
	
	private String bookShopName;
	private List<Book> books = new ArrayList<>();
	
	public String getBookShopName() {
		return bookShopName;
	}
	public void setBookShopName(String bookShopName) {
		this.bookShopName = bookShopName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	@Override
	public String toString() {
		return "BookShop [bookShopName=" + bookShopName + ", books=" + books + "]";
	}
	
	public void loadBooksData() {
		for(int i=1 ; i<10; i++) {
			Book b = new Book();
			b.setBookName("Book" + i);
			b.setId(i);
			getBooks().add(b);
		}
	}
	
	// Here the perfect cloning is handled
	@Override
	protected BookShop clone() throws CloneNotSupportedException{
		BookShop bs = new BookShop();
		for (Book b : this.getBooks()) {
			bs.getBooks().add(b);
		}
		return bs;
	}
}
