package com.tnsif.singleinheritance;

public class citizen {
	
	private String name;
	private String adharno;
	private String address;
	private String phno;
	
	public citizen()
	{
		System.out.println("citizen object created");
			
	}
	
	public citizen(String name, String adharno, String address, String phno) {
		this.name=name;
		this.adharno=adharno;
		this.address=address;
		this.phno=phno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdharno() {
		return adharno;
	}

	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	@Override
	public String toString() {
		return "citizen [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	

}
