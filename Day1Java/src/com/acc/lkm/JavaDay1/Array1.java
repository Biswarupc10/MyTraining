package com.acc.lkm.JavaDay1;
import java.util.Scanner;
public class Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[4];
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("before");
		for(int x=0;x<arr.length-1;x++) {
			System.out.print(x);
		}
		arr[arr.length-1]=sc.nextInt();
		System.out.println("after");
		for(int e:arr) {
			System.out.print(e);
		}
	}

}
