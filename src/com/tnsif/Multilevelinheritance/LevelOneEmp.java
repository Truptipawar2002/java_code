package com.tnsif.Multilevelinheritance;
import java.util.Date;
public class LevelOneEmp extends Employee{
	
	private int noOfShares;
	private String authority;
	
	public LevelOneEmp(String name, long contact, Date dateOfBirth, String deptName, double baseSalary, int noOfShares, String authority) {
		
		super(name, contact, dateOfBirth, deptName, baseSalary);
		this.noOfShares=noOfShares;
		this.authority=authority;	
	}

	public int getNoOfShares() {
		return noOfShares;
	}

	public void setNoOfShares(int noOfShares) {
		this.noOfShares = noOfShares;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	@Override
	public String toString() {
		return "LevelOneEmp [noOfShares=" + noOfShares + ", authority=" + authority + ", getDepName()=" + getDepName()
				+ ", getBaseSalary()=" + getBaseSalary() + ", toString()=" + super.toString() + ", getName()="
				+ getName() + ", getContactNo()=" + getContactNo() + ", getDateOfBirth()=" + getDateOfBirth()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

	}

