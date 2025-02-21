package service;

import model.*;

import java.util.ArrayList;
import java.util.Arrays;

public class MainService {

	private static ArrayList<Student> allStudents = new ArrayList<>();
	private static ArrayList<Professor> allProfessors = new ArrayList<>();
	private static ArrayList<Course> allCourses = new ArrayList<>();
	private static ArrayList<Grade> allGrades = new ArrayList<>();


	public static void main(String[] args) {
		Student st1 = new Student();
		Student st2 = new Student("Elvijs", "Leistmanis");
		Student st3 = new Student("E!$lvijs", "");

		allStudents.addAll(Arrays.asList(st1, st2, st3));
		System.out.println(allStudents);
		
		System.out.println("-----------------------");
		
		Professor p1 = new Professor();
		Professor p2 = new Professor("Karina", "Skirmante", Degree.mg);
		Professor p3 = new Professor("K95rina", "___", Degree.bsc);

		allProfessors.addAll(Arrays.asList(p1, p2, p3));
		System.out.println(allProfessors);

		System.out.println("-----------------------");

		Course c1 = new Course("test", 4, p2);
		Course c2 = new Course();
		Course c3 = new Course("", 0, p3);

		allCourses.addAll(Arrays.asList(c1, c2, c3));
		System.out.println(allCourses);

		System.out.println("-----------------------");

		Grade g1 = new Grade();
		Grade g2 = new Grade(6, st2, c1);
		Grade g3 = new Grade(0, st1, c1);

		allGrades.addAll(Arrays.asList(g1, g2, g3));
		System.out.println(allGrades);
	}

	//CRUD
	//C - Create

	public static void createProfessor(String name, String surname, Degree degree) throws Exception {
		for (Professor professor : allProfessors) {
			if (professor.getName().equals(name) && professor.getSurname().equals(surname)) {
				throw new Exception("Professor already exists.");
			}
		}

		allProfessors.add(new Professor(name, surname, degree));
	}

}
