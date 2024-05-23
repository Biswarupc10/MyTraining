package com.acc.lkm.JavaDay1;
import java.util.Scanner;
public class MatrixMultiply {

	public static int[][] multiply(int[][] arr1,int[][]arr2){
		int r1=arr1.length;
		int c1=arr1[0].length;
		int r2=arr2.length;
		int c2=arr2[0].length;
		
		//Result matrix
		int product[][]=new int[r1][c2];
		
		if(c1!=r2) {
			throw new IllegalArgumentException("Not same");
		}
		
		//Multiply the matrix
		for(int i=0;i< r1;i++) {
			for(int j=0;j<c2;j++) {
				for(int k=0;k<c1;k++) {
					product[i][j] += arr1[i][k]*arr2[k][j];
				}
			}
		}
		return product;
	}
	//Printing the matrix
	public static void printMatrix(int arr[][]) {
		for(int[]row:arr) {
			for(int col:row) {
				System.out.print(col+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row for 1st matrix");
		int r1=sc.nextInt();
		System.out.println("Enter the coln for 1st matrix");
		int c1=sc.nextInt();
		
		//read the first matrix
		int first[][]=new int[r1][c1];
		
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				first[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter the row for 2nd matrix");
		int r2=sc.nextInt();
		System.out.println("Enter the coln for 2nd matrix");
		int c2=sc.nextInt();
		
		//read the first matrix
		int second[][]=new int[r2][c2];
		
		for(int i=0;i<r2;i++) {
			for(int j=0;j<c2;j++) {
				second[i][j]=sc.nextInt();
			}
		}
		try {
			int[][]product=multiply(first,second);
			System.out.println("Product is:");
			printMatrix(product);
		}catch(IllegalArgumentException e) {
			System.out.println(e);
		}
		sc.close();
	}

}
