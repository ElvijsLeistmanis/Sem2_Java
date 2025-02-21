package model;

public class Grade {
    private static long counter = 200000;

    private long gID;
    private int value;
    private Student student;
    private Course course;

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        if (course != null) this.course = course;
        else this.course = new Course();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        if (student != null) this.student = student;
        else this.student = new Student();
    }

    public long getgID() {
        return gID;
    }

    public void setgID() {
        gID = counter++;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (value > 0 && value <= 10) this.value = value;
        else this.value = 1;
    }

    public Grade() {
        setgID();
        setValue(1);
        setStudent(new Student());
        setCourse(new Course());
    }

    public Grade(int value, Student student, Course course) {
        setgID();
        setValue(value);
        setStudent(student);
        setCourse(course);
    }

    @Override
    public String toString() {
        return "Grade " + gID + ": " + value + " for " + student + " (" + course.getTitle() + ")";
    }
}
