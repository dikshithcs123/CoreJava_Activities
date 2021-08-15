package com.ltts;


class Employee{
	private String name;
	private String address;
	private String mobile;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
}

public class EmployeeMain {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.setName("Ravi");
		emp1.setAddress("Pune");
		emp1.setMobile("9998887771");
		
		System.out.println("Employee Details");
		
		System.out.println("Name: "+emp1.getName());
		System.out.println("Address: "+emp1.getAddress());
		System.out.println("Mobile: "+emp1.getMobile());
		
	}

}
