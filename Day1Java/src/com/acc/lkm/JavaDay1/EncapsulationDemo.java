package com.acc.lkm.JavaDay1;

public class EncapsulationDemo {
	//private data members
		private String account_holder;
		private int CVV;
		private double balance;
		private int OTP;
	public String getAccount_holder() {
		return account_holder;
	}

	public void setAccount_holder(String account_holder) {
		this.account_holder = account_holder;
	}

	public int getCVV() {
		return CVV;
	}

	public void setCVV(int cVV) {
		CVV = cVV;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getOTP() {
		return OTP;
	}

	public void setOTP(int oTP) {
		OTP = oTP;
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationDemo encap=new EncapsulationDemo();
		encap.setAccount_holder("Roop");
		encap.setBalance(100000.00);
		encap.setCVV(122);
		encap.setOTP(132);
		
		System.out.println(encap.getAccount_holder()+"\n"+encap.getBalance()+"\n"+encap.getCVV()+"\n"+encap.getOTP()+"\n"+encap.getClass());
	}

}
