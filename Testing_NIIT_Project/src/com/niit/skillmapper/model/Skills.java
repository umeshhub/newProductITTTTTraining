package com.niit.skillmapper.model;

public class Skills {
	
	
	private String skill,certification,language;
	private int empcode,teachingHours,studentsTrained,rating,studentPlaced,yearsofexperince;
	
	private User user;
	
	

	public int getEmpcode() {
		return empcode;
	}

	public void setEmpcode(int empcode) {
		this.empcode = empcode;
	}

	public String getSkill() {
		return skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getCertification() {
		return certification;
	}

	public void setCertification(String certification) {
		this.certification = certification;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public int getTeachingHours() {
		return teachingHours;
	}

	public void setTeachingHours(int teachingHours) {
		this.teachingHours = teachingHours;
	}

	public int getStudentsTrained() {
		return studentsTrained;
	}

	public void setStudentsTrained(int studentsTrained) {
		this.studentsTrained = studentsTrained;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getStudentPlaced() {
		return studentPlaced;
	}

	public void setStudentPlaced(int studentPlaced) {
		this.studentPlaced = studentPlaced;
	}

	public int getYearsofexperince() {
		return yearsofexperince;
	}

	public void setYearsofexperince(int yearsofexperince) {
		this.yearsofexperince = yearsofexperince;
	}

	public User getUser() {
		return user;
	}

	public Skills(String skill, String certification, String language, int teachingHours, int studentsTrained,
			int rating, int studentPlaced, int yearsofexperince) {
		super();
		this.skill = skill;
		this.certification = certification;
		this.language = language;
		this.teachingHours = teachingHours;
		this.studentsTrained = studentsTrained;
		this.rating = rating;
		this.studentPlaced = studentPlaced;
		this.yearsofexperince = yearsofexperince;
	}
	
	public Skills(int empcode,String skill, String certification,  int teachingHours, int studentsTrained,
			int rating, int studentPlaced, int yearsofexperince,String language) {
		super();
		this.empcode=empcode;
		this.skill = skill;
		this.certification = certification;
		
		this.teachingHours = teachingHours;
		this.studentsTrained = studentsTrained;
		this.rating = rating;
		this.studentPlaced = studentPlaced;
		this.yearsofexperince = yearsofexperince;
		this.language = language;
	}

	@Override
	public String toString() {
		return "Skills [skill=" + skill + ", certification=" + certification + ", language=" + language
				+ ", teachingHours=" + teachingHours + ", studentsTrained=" + studentsTrained + ", rating=" + rating
				+ ", studentPlaced=" + studentPlaced + ", yearsofexperince=" + yearsofexperince + "]";
	}
	
	

}
