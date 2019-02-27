package com.psr.dp.prototype;

public class Demo {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookShop bs = new BookShop();
		bs.loadBooksData();
		bs.setBookShopName("Shop");
		
		// Cloning the object i.e retrieving a prototype
		BookShop bs1 = bs.clone();
		bs1.setBookShopName("Shop1");
		
		bs1.getBooks().remove(0);
		System.out.println(bs);
		System.out.println(bs1);
	}
}
