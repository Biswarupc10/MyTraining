package com.acc.lkm.JavaDay1;
import java.util.Scanner;
public class TotalAndPercent {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of subjects");
		int sub=sc.nextInt();
		double total=0;
		
		System.out.println("Enter the marks");
		for(int i=0;i<sub;i++) {
			double marks=sc.nextDouble();
			total +=marks;
		}
		System.out.println(total);
		System.out.println((total*100)/(sub*100)+"%");
	}

}
