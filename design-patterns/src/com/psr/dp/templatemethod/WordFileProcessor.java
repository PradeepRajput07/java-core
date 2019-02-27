package com.psr.dp.templatemethod;

public class WordFileProcessor extends FileProcessor {

	@Override
	public void readFile() {
		System.out.println("Reading Word File...   !!!");
		
	}

	@Override
	public void writeFile() {
		System.out.println("Writing to Word File...   !!!");
		
	}

}