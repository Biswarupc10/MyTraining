package com.acc.lkm.JavaDay1;
import java.util.Scanner;
public class Leap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int year=sc.nextInt();
		boolean flag=false;
		if(year %4==0) {
			flag=true;
			if(year%100!=0) {
				if(year%400==0) {
					flag=true;
				}
				else {
					flag=false;
				}
			}
			
		}
		else {
			flag=false;
		}
		if(!flag) {
			System.out.println("Leap Year");
		}
		else {
			System.out.println("Not Leap year");
		}
		sc.close();
	}

}
