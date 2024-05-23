package com.acc.lkm.CollectionDemo;
import com.acc.lkm.CollectionDemo.Employee;
import java.util.*;
public class display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Employee> array=new ArrayList<>();
		
		for(int i=0;i<4;i++) {
			System.out.format("Enter the details of the %d Employee \n",i+1);
			String id=sc.nextLine();
//			System.out.println("Enter name");
//			String name=sc.next();
//			System.out.println("Enter Location");
			//String loc=sc.next();
			array.add(new Employee(id));
		}
		
		
		
		System.out.println("Here is the list");
		for(Employee e:array) {
			System.out.println("Details here");
			System.out.println("EID: "+ e.EmpId);
			System.out.println("Name: "+e.name);
			System.out.println("Location: "+e.loc);
			System.out.println();
		}
		
		
	}

}
