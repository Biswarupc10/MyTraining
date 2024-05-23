package com.acc.lkm.JavaDay1;

public class ArraySizeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		changeArraySize();
	}
	private static void changeArraySize() {
		int[] array=new int[5];
		System.out.println("Before Changing: "+array.length);
		
		array=java.util.Arrays.copyOf(array, array.length*2);
		
		System.out.println("After chnaging: "+array.length);
	}
}
