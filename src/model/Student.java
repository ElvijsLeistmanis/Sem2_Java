package model;

import java.util.ArrayList;

public class Student {

	private static long counter = 10000;
	private long stID;
	private String name;
	private String surname;

	private ArrayList<Grade> grades = new ArrayList();
	
	public long getStID() {
		return stID;
	}
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	
	
	
	public void setStID() {
		stID = counter++;
	}
	
	public void setName(String name) {
		if (name != null && name.matches("[A-Z]{1}[a-z]{3,10}")) {
			this.name = name;
		}
		else {
			this.name = "Student";
		}
	}

	public void setSurname(String surname) {
		if (surname != null && surname.matches("[A-Z]{1}[a-z]{3,10}")) {
			this.surname = surname;
		}
		else {
			this.surname = "Student";
		}
	}
	
		
	
	public Student() {
		setStID();
		setName("Student");
		setSurname("Student");
	}
	
	public Student(String name, String surname) {
		setStID();
		setName(name);
		setSurname(surname);
	}
	
	
	
	@Override
	public String toString() {
		return "Student " + stID + ": " + name + " " + surname;
	}
	
	
}
