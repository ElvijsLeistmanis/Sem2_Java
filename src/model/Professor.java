package model;

public class Professor {
	private static long pID = 0;
	private String name;
	private String surname;
	private Degree degree;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Degree getDegree() {
		return degree;
	}
	public void setDegree(Degree degree) {
		this.degree = degree;
	}
	public long getpID() {
		return pID;
	}
	
	public Professor(String name, String surname, Degree degree) {
		if (name != null && surname != null && degree != null) {
			this.name = name;
			this.surname = surname;
			this.degree = degree;
		}
		else {
			
		}
		pID++;
		
	}
	
	
}
