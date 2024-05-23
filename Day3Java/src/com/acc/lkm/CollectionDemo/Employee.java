package com.acc.lkm.CollectionDemo;

public class Employee {
	String name;
	int EmpId;
	String loc;
	
	public Employee(String id ){
		String arr[]=id.split(" ");
		try {
			if(arr.length==3) {
				this.name=arr[1];
				this.EmpId=Integer.parseInt(arr[0]);
				this.loc=arr[2];
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

	



}
