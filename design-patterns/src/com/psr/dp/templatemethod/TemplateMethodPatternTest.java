package com.psr.dp.templatemethod;

public class TemplateMethodPatternTest {
	public static void main(String[] args) {
		FileProcessor fileProcessor = new PDFFileProcessor();
		fileProcessor.processFile();
		System.out.println();
		System.out.println("------------********************----------------");
		System.out.println("------------********************----------------");
		System.out.println();
		FileProcessor wordFileProcessor = new WordFileProcessor();
		wordFileProcessor.processFile();
	}
}
