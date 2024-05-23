package com.acc.lkm.JavaDay1;
import java.util.Scanner;
public class Overloading1 {
	String name="John";
	String role="Operator";
	public void sim1(String name,String role,long contact) {
		this.name=name;
		this.role=role;
		System.out.println(this.name+"\n"+this.role+"\n"+contact);
	}
	public void sim1(String name, String role, long contact,long contact1) {
		this.name=name;
		this.role=role;
		System.out.println(name+"\n"+role+"\n"+contact+"\n"+contact1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		long contact=sc.nextLong();
		long contact1=sc.nextLong();
		
		Overloading1 ob=new Overloading1();
		ob.sim1(ob.name, ob.role, contact);
		ob.sim1(ob.name,ob.role,contact,contact1);
		sc.close();
	}

}
