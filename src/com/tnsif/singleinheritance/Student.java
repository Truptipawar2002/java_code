package com.tnsif.singleinheritance;

public class Student extends citizen {
	
	private int rollNo;
	private String collegeName;
	
	public Student()
	{
		super();
		
	}
	
	public Student(String name, String adharno, String address, String phno, int rollNo, String collegeName) {
		
		super(name, adharno, address, phno);
		this.rollNo=rollNo;
		this.collegeName=collegeName;
		
		
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]"; 
	}

}
