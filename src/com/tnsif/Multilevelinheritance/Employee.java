package com.tnsif.Multilevelinheritance;
import java.util.Date;

public class Employee extends Person{
	
	private String depName;
	private double baseSalary;
	
	public Employee(String name, long contactNo, Date dateOfBirth, String deptName, Double baseSalary)
	{
		super(name, contactNo, dateOfBirth);
		this.depName=depName;
		this.baseSalary=baseSalary;	
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return "Employee [depName=" + depName + ", baseSalary=" + baseSalary + ", getName()=" + getName()
				+ ", getContactNo()=" + getContactNo() + ", getDateOfBirth()=" + getDateOfBirth() + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}
	

}