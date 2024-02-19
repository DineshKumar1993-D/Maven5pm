package com.filreadm;

import java.io.IOException;

import com.configura.ConFigClass;

public class FileReadMangerClass {

	private FileReadMangerClass() {

		// To restrict the object creation in any other classes

	}
	
	public static FileReadMangerClass getInstanceFR() {
		
		FileReadMangerClass reader = new FileReadMangerClass();
		
		return reader;
	}
	
	public ConFigClass getInstanceCR() throws IOException {
		
		ConFigClass helper= new ConFigClass();
		
		return helper;
	}
	

}
