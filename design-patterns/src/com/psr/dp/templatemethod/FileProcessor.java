package com.psr.dp.templatemethod;

public abstract class FileProcessor {
	
	public final void processFile() {
		openFile();
		readFile();
		writeFile();
		saveFile();
		closeFile();
	}
	public final void openFile() {
		System.out.println("Opening the file now...   !!!");
	}
	
	public abstract void readFile();
	public abstract void writeFile();
	
	public final void saveFile() {
		System.out.println("Saving the file now...   !!!");
	}
	
	public final void closeFile() {
		System.out.println("Closing the file now...   !!!");
	}

}
