package com.tnsif.Multilevelinheritance;

import java.util.Date;
public class Multilevelinheritance {

	public static void main(String[] args) {
			
			Person p1 = new Person("Atharva",897879876 , Date(2000,12,2));
			System.out.println(p1);
			
			Employee p2 = new Employee("Pranav", 78600012, Date(1995,05,07),"Sales",450.00);
			System.out.println(p2);
			  
			LevelOneEmp p3= new LevelOneEmp("Madhur", 897865456, Date(1988,15,02),"Account",850000,20,"Signing Authority");
			System.out.println(p3);
			
			

		}
		// TODO Auto-generated method stub

	private static Date Date(int i, int j, int k) {
		// TODO Auto-generated method stub
		return null;
	}

	}