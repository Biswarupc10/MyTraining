package com.acc.lkm.JavaDay1;

public class Simple {
int a=100;//instance or global variable
static String org="Accentire";

void set(int x) { //here int x is the local variable
	System.out.println(x);
}
static {   //This is a static block which will be run first 
	System.out.println(org);  
}
{  //This is a block for instance initializer which will be run on 2nd priority
	a=500;
	System.out.println(a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Simple simple=new Simple();
		System.out.println(simple);// this will give the memory address of the object
		simple.set(300);
		int x=100;
	     x /=20;
	     System.out.println(x^500);
	     System.out.println(x);
		System.out.println(500/25);
		System.out.println(simple.a);
	}

}
