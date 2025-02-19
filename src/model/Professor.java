package model;

public class Professor {
	
	private static long counter = 0;
	private long pID;
	private String name;
	private String surname;
	private Degree degree;
	
	private Course course;
	
	//Getters
	
	public long getpID() {
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

	public void setPID() {
		pID = counter++;
	}
	
	public void setName(String name) {
		if (name != null && name.matches("[A-Z]{1}[a-z]{3,10}")) {
			this.name = name;
		}
		else {
			this.name = "Professor";
		}
	}

	public void setSurname(String surname) {
		if (surname != null && surname.matches("[A-Z]{1}[a-z]{3,10}")) {
			this.surname = surname;
		}
		else {
			this.surname = "Professor";
		}
	}

	public void setDegree(Degree degree) {
		if (degree != null) {
			this.degree = degree;
		}
		else {
			this.degree = Degree.bsc;
		}
	}
	
	//Constructors

	public Professor() {
		setPID();
		setName("Professor");
		setSurname("Professor");
		setDegree(Degree.bsc);
	}
	
	public Professor(String name, String surname, Degree degree) {
		setPID();
		setName(name);
		setSurname(surname);
		setDegree(degree);
	}
	
	//toString

	@Override
	public String toString() {
		return "Professor " + pID + ": " + name + " " + surname + " (" + degree + ")";
	}
	
	
}
