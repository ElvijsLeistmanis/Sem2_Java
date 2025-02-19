package model;

public class Course {
	private static long counter = 100000; 
	
	private long cID;
	private String title;
	private int creditPoints;
	private Professor professor;
	
	
	
	public long getcID() {
		return cID;
	}
	public String getTitle() {
		return title;
	}
	public int getCreditPoints() {
		return creditPoints;
	}
	public Professor getProfessor() {
		return professor;
	}
	
	
	
	public void setcID() {
		cID = counter++;
	}
	
	public void setTitle(String title ) {
		if (title != null && title.matches("[A-Za-z ]{4,20}")) {
			this.title = title;
		}
		else {
			this.title = "Course";
		}
	}
	
	public void setCreditPoints(int creditPoints) {
		if (creditPoints > 0 && creditPoints < 12) {
			this.creditPoints = creditPoints;
		}
		else {
			this.creditPoints = 1;
		}
	}
	
	public void setProfessor(Professor professor) {
		if (professor != null) {
			this.professor = professor;
		}
		else {
			this.professor = new Professor();
		}
	}
	
	
	
	public Course() {
		setcID();
		setTitle("Course");
		setCreditPoints(1);
		setProfessor(new Professor());
	}
	
	public Course(String title, int creditPoints, Professor professor) {
		setcID();
		setTitle(title);
		setCreditPoints(creditPoints);
		setProfessor(professor);
	}
	
	
	
	@Override
	public String toString() {
		return "Course " + cID + ": " + title + " " + creditPoints + "KP (" + professor + ")";
	}
	
}
