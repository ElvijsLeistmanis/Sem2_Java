package service;

import model.Student;
import model.Degree;
import model.Professor;

public class MainService {
	public static void main(String[] args) {
		Student st1 = new Student();
		System.out.println(st1);
		
		Student st2 = new Student("Elvijs", "Leistmanis");
		System.out.println(st2);
		
		Student st3 = new Student("E!$lvijs", "");
		System.out.println(st3);
		
		System.out.println("-----------------------");
		
		Professor p1 = new Professor();
		System.out.println(p1);
		
		Professor p2 = new Professor("Karina", "Skirmante", Degree.mg);
		System.out.println(p2);
		
		Professor p3 = new Professor("K95rina", "___", Degree.bsc);
		System.out.println(p3);
	}

}
