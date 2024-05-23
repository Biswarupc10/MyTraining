package com.acc.lkm.JavaDay1;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int a=0;
		int b=1;
		int c=0;
		int n=sc.nextInt();
//		System.out.println(a);
//		System.out.println(b);
		for(int i=2;i<n;i++) {
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);
		}
		
		sc.close();
	}

}
