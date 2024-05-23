package com.acc.lkm.CollectionDemo;

public class Customer {
	int id;
	String name;
	String product;
	int price;
	
	public Customer(String id) {
		String arr[]=id.split(" ");
		try {
			if(arr.length==4) {
				this.name=arr[1];
				this.id=Integer.parseInt(arr[0]);
				this.product=arr[2];
				this.price=Integer.parseInt(arr[3]);
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}		
	}
}
