package com.acc.lkm.Day3Java;

public class ExceptionActivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int arr[]=new int[5];
			System.out.println(arr[7]);
			
			String st=null;
			System.out.println(st.length());
			
			String st1="hello";
			int n=Integer.parseInt(st1);
		}catch(Exception e) {
			System.out.println(e);
		}
		//This will block will run by jvm even there is a compile time eroor in the code
		finally {
			System.out.println("Hi");
		}
		
	}

}
