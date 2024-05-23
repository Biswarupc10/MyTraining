package com.acc.lkm.CollectionDemo;

import java.util.LinkedList;
import java.util.Scanner;

public class CustomerManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		LinkedList<Customer> array=new LinkedList<>();
		
		
			System.out.format("Enter the details of the Customer \n");
			String id=sc.nextLine();
//			System.out.println("Enter name");
//			String name=sc.next();
//			System.out.println("Enter Location");
			//String loc=sc.next();
			array.add(new Customer(id));
		
		
		
		
		System.out.println("Here is the list");
		for(Customer e:array) {
			System.out.println("Details here");
			System.out.println("EID: "+ e.id);
			System.out.println("Name: "+e.name);
			System.out.println("Product: "+e.product);
			System.out.println("Price: "+e.price);
			System.out.println();
		}
		
		
	}

}
