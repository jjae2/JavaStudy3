package com.prac.s1.student;

import java.util.Scanner;

public class StudentView {// 출력전용
	public void viewMessage(String message) {
		System.out.println("----");
		System.out.println(message);
		System.out.println("----");
	}

	public void viewStudent(Student student) {

		System.out.println("학생의 이름은::" + student.name);
		System.out.println("학생의 번호는::" + student.num);
		System.out.println("학생의 국어점순는::" + student.kor);
		System.out.println("학생의 영어점수는::" + student.eng);
		System.out.println("학생의 수학점수는::" + student.math);
		System.out.println("학생의 총점은::" + student.total);
		System.out.println("학생의 평균은::" + student.avg);
	}

	public void viewStudents(Student students[]) {

		for (int i = 0; i < students.length; i++) {
			//Student student = students[i];
			//this.viewStudent(students);
			this.viewStudent(students[i]);//26+27합쳐서 줄인다 항상 줄이는습관
		}

	}
}
