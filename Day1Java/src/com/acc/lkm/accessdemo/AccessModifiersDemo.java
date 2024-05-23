package com.acc.lkm.accessdemo;

import com.acc.lkm.JavaDay1.*;
public class AccessModifiersDemo {
	
	//this main method is from the carObject.java from the com.acc.lkm.JavaDay1 package
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CarObject cr=new CarObject();
		System.out.println(cr.details());
		
		System.out.println(new java.util.Date(System.currentTimeMillis()));
		cr.start();
		cr.drive();
	}
}
