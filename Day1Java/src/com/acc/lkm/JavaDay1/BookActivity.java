package com.acc.lkm.JavaDay1;
import java.util.Scanner;
public class BookActivity {
String author;
String title;
int year;
	//Parameterized constructor
	public BookActivity(String author,String title,int year) {
		//moving the local variable input to the instance variable
		this.author=author;
		this.title=title;
		this.year=year;
	}
	public String display() {
		return this.author+"\n"+this.title+"\n"+this.year;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String title=sc.nextLine();
		int year=sc.nextInt();
		
		BookActivity book=new BookActivity(name,title,year);
		System.out.println(book.display());
		sc.close();
	}

}
