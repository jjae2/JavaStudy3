package com.prac.s1.student;

import java.util.Scanner;

public class StudentUtil {// 학생 객체를 생성하고 정보를 입력 받는 용도
	Scanner sc;

	public Student[] makeStudents() {

		System.out.println("학생 수를 입력하세요");
		int number = this.sc.nextInt();
		Student students[] = new Student[number];
		for (int i = 0; i < students.length; i++) {

			Student stu = new Student(); // 객체 메모리공간을 생성

			System.out.println("이름을 입력하세요.");
			stu.name = sc.next();
			System.out.println("번호를 입력하세요.");
			stu.num = sc.nextInt();
			System.out.println("국어점수를 입력하세요.");
			stu.kor = sc.nextInt();
			System.out.println("영어점수를 입력하세요.");
			stu.eng = sc.nextInt();
			System.out.println("수학점수를 입력하세요.");
			stu.math = sc.nextInt();
			stu.makeTotal();
			students[i] = stu;// 배열1칸씩 넣는 개념
		}
		return students;
	}

	public Student makeStudent() {
		// 이름 번호 국어 영어 수학 입력받아 리턴

		System.out.println("이름을 입력하세요.");
		String name = this.sc.next();
		System.out.println("번호를 입력하세요.");
		int num = sc.nextInt();
		System.out.println("국어점수를 입력하세요.");
		int kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요.");
		int eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요.");
		int math = sc.nextInt();
		Student student = new Student();
		student.name = name;
		student.num = num;
		student.kor = kor;
		student.eng = eng;
		student.math = math;
		student.makeTotal();

		return student;
		// string ,int 같이 리턴받으려면 방법
		// 1.배열 사용 2.class사용

	}

	public Student search(Student students[]) {
		// 검색 할 학생번호 입력
		// 입력받은 학생 일치 학생 찾아 학생출력

		System.out.println("학생 번호를 입력하세요");
		int select = sc.nextInt();
		Student student = null;
		for (int i = 0; i < students.length; i++) {
			if (select == students[i].num) {
				System.out.println("찾았습니다.");
				student = students[i];
				break;
			}
		}
		return student;
	}

	public void initUtil() {
		this.sc = new Scanner(System.in);
	}
}
