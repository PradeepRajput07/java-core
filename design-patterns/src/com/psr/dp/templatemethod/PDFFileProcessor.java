package com.psr.dp.templatemethod;

public class PDFFileProcessor extends FileProcessor {

	@Override
	public void readFile() {
		System.out.println("Reading PDF File...   !!!");
		
	}

	@Override
	public void writeFile() {
		System.out.println("Writing to PDF File...   !!!");
		
	}

}
