package com.acc.lkm.JavaDay1;
import java.util.Date;
public class CarObject {
	String carName="BMW";
	String carModel="G3 Limousine";
	String carColor="Black";
	int manufacturingYear=2023;
	Date date;
	public void start() {
		System.out.println("Car starts");
	}
	public void drive() {
		System.out.println("driver is driving");
	}
	public void brake() {
		System.out.println("Car stopped");
	}
	public String details() {
		this.carName=carName;
		this.carModel=carModel;
		this.carColor=carColor;
		this.manufacturingYear=manufacturingYear;
		return this.carName+" "+this.carModel+" "+this.carColor+" "+this.manufacturingYear;
	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		CarObject cr=new CarObject();
//		System.out.println(cr.carName);
//		System.out.println(cr.carModel);
//		System.out.println(cr.carColor);
//		System.out.println(cr.manufacturingYear);
//		System.out.println(new java.util.Date(System.currentTimeMillis()));
//		cr.start();
//		cr.drive();
//	}

}
