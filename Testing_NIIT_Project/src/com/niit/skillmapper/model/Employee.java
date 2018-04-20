package com.niit.skillmapper.model;

import java.sql.Date;



public class Employee {
	
	private int id;
	private String name,designation,gender,city,contactNo,emailid;
	private String dateofjoining,dateofbirth;
	
	private User user;
	
	public User getUser() {
		return user;
	}
	
	public void setUser(User user)
	{
		this.user=user;
	}

	
	public Employee(String name, String designation, String gender, String city, String contactNo,
			String emailid, String dateofjoining, String dateofbirth) {
		super();
		
		this.name = name;
		this.designation = designation;
		this.gender = gender;
		this.city = city;
		this.contactNo = contactNo;
		this.emailid = emailid;
		this.dateofjoining = dateofjoining;
		this.dateofbirth = dateofbirth;
		
	}
	
	
	
	
	
	public Employee(int id, String name, String designation, String gender, String city, String contactNo,
			String emailid, String dateofjoining, String dateofbirth) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.gender = gender;
		this.city = city;
		this.contactNo = contactNo;
		this.emailid = emailid;
		this.dateofjoining = dateofjoining;
		this.dateofbirth = dateofbirth;
	}

/*	
	public Employee(int id, String name, String designation, String gender, String city, String contactNo,
			String emailid, Date dateofjoining, Date dateofbirth,String username,String password,String role) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.gender = gender;
		this.city = city;
		this.contactNo = contactNo;
		this.emailid = emailid;
		this.dateofjoining = dateofjoining;
		this.dateofbirth = dateofbirth;
		this.user.setId(id);
		this.user.setUsername(username);
		this.user.setPassword(password);
		this.user.setRole(role);
	}
*/



	public int getId() {
		return id;
	}





	public String getName() {
		return name;
	}





	public String getDesignation() {
		return designation;
	}





	public String getGender() {
		return gender;
	}





	public String getCity() {
		return city;
	}





	public String getContactNo() {
		return contactNo;
	}





	public String getEmailid() {
		return emailid;
	}





	public String getDateofjoining() {
		return dateofjoining;
	}





	public String getDateofbirth() {
		return dateofbirth;
	}





	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", gender=" + gender
				+ ", city=" + city + ", contactNo=" + contactNo + ", emailid=" + emailid + ", dateofjoining="
				+ dateofjoining + ", dateofbirth=" + dateofbirth + "]";
	}
	
	
	

}

