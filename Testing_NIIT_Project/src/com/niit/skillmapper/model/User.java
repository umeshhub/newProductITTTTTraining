package com.niit.skillmapper.model;

public class User {
	
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	private String username,password,role,status,remarks;

	public User()
	{}
	public User(String password, String role,String status,String remarks) {
		super();
	//	this.username = username;
		this.password = password;
		this.role = role;
		this.status=status;
		this.remarks=remarks;
	}
	
	public User(int id,String password,String role, String status,String remarks) {
		super();
		this.id=id;
	//	this.username = username;
		this.password = password;
		this.role = role;

		this.status=status;
		this.remarks=remarks;
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}

	public String getRole() {
		return role;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", role=" + role + "]";
	}

	
	
	

}
