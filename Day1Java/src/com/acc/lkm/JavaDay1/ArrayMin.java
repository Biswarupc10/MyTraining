package com.acc.lkm.JavaDay1;
import java.util.Scanner;
public class ArrayMin {
	
	public static int minElement(int arr[]) {
		int min=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
		}
		return min;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int []arr=new int[5];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int x=minElement(arr);
		System.out.println(x);
	}

}
