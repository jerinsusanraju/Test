package com.excel.program;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		
		String d= ExcelRead.getStringData(1, 0);
		System.out.println(d);
		String e = ExcelRead.getIntData(1, 1);
		System.out.println(e);
	}

}
