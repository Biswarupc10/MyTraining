package com.acc.lkm.Day3Java;

import java.io.IOException;

public class ThrowDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			readFile();
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
	private static void readFile()throws IOException {
		throw new IOException("File not found");
	}
}
