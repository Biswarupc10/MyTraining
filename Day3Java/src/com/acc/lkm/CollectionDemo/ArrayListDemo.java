package com.acc.lkm.CollectionDemo;
import java.util.*;
import java.util.Scanner;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Non-Generic
		//ArrayList arrayList=new ArrayList();
		//Generic
		ArrayList<String>array=new ArrayList<String>();
		Scanner sc=new Scanner(System.in);
		String st;
		System.out.println("Enter: ");
		for(int i=0;i<5;i++) {
			st=sc.next();
			array.add(st);
		}
		Iterator iterator=array.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println(array.size());
	}

}
