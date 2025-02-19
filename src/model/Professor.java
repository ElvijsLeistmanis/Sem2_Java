package model;

public class Professor {
	private static long pID = 0;
	private String name;
	private String surname;
	private Degree degree;
	
	//Getters
	
	public static long getpID() {
		return pID;
	}

	public String getName() {
		return name;
	}

	public String getSurname() {
		return surname;
	}

	public Degree getDegree() {
		return degree;
	}
	
	//Setters

	public void setName(String name) {
		if (name != null && name.matches("[A-Z]{1}[a-z]{3-10}")) {
			this.name = name;
		}
	}

	public void setSurname(String surname) {
		if (surname != null && surname.matches("[A-Z]{1}[a-z]{3-10}")) {
			this.surname = surname;
		}
	}

	public void setDegree(Degree degree) {
		if (degree != null) {
			this.degree = degree;
		}
	}
	
	//Constructors

	public Professor() {
		this.name = "Professor";
		this.surname = "professor";
		this.degree = Degree.bsc;
		pID++;
	}
	
	public Professor(String name, String surname, Degree degree) {
		this.name = name;
		this.surname = surname;
		this.degree = degree;
		pID++;
	}
	
	//toString

	@Override
	public String toString() {
		return "Professor " + name + " " + surname + " (" + degree + ")";
	}
	
	
}
