package com.acc.lkm.Day3Java;
import java.io.IOException;
public class NestedTry {
	String name;
	String skill;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NestedTry t=new NestedTry();
		try {
			t.setName("Rohit");
			t.setSkill("Java");
			try {
				if(t.getName()==null) {
					throw new IOException("name enter is invalid");
				}
				try {
					if(t.getSkill()==null) {
						throw new IOException("Skill enter is invalid");
					}
				}catch(Exception e) {
					System.out.println(e);
				}
			}catch(Exception e) {
				System.out.println(e);
			}
//			try {
//				if(t.getSkill()==null) {
//					throw new IOException("Skill entered is invalid");
//				}
//				
//			}
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
