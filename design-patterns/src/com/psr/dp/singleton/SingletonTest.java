package com.psr.dp.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonTest {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws Exception{
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		print ("s1", s1);
		print ("s2", s2);
		
		//Serialization Example:
		/*ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("/temp/s2.ser"));
		oos.writeObject(s2);
		//Deserialization:
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("/temp/s2.ser"));
		Singleton s4 = (Singleton)ois.readObject();
		print ("Deserialized s2", s4);*/
		
		//Reflection can break singleton
		Class clazz = Class.forName("com.psr.dp.singleton.Singleton");
		Constructor<Singleton> ctor = clazz.getDeclaredConstructor();
		ctor.setAccessible(true);
		Singleton s3 = ctor.newInstance();
		print ("s3", s3);
		
		//Cloning
		/*Singleton s5 = (Singleton)s2.clone();
		print ("s5" ,s5);*/
		
		//Thread Pool Example
		ExecutorService service = Executors.newFixedThreadPool(2);
		service.submit(SingletonTest::useSingleton);
		service.submit(SingletonTest::useSingleton);
		service.shutdown();
		
	}

	private static void print(String name, Singleton object) {
		System.out.println(String.format("Object: %s , Hashcode: %d", name, object.hashCode()));
	}

	public static void useSingleton() {
		Singleton singleton = Singleton.getInstance();
		print("singleton", singleton);
	}
}
