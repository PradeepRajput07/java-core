package com.psr.dp.singleton;

import java.io.Serializable;

public class Singleton implements Serializable, Cloneable{

	private static final long serialVersionUID = 1L;
	//private static Singleton soleInstance = new Singleton(); //Eager Creation
	private static volatile Singleton soleInstance = null;
	
	private Singleton() {
		/*if(soleInstance == null) {
			throw new RuntimeException("Cannot create !! Please use the getInstance method");
		}*/
		System.out.println("Creating the instance ... !");
	}
	
	public static  Singleton getInstance() { //Double check locking for multithreaded envts
		if(soleInstance == null) { //Check 1
			synchronized(Singleton.class) {
				if(soleInstance == null) { //Check 2
					soleInstance = new Singleton();
				}
			}
		}
		return soleInstance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
