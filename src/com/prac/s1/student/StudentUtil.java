package com.prac.s1.student;
import java.util.Scanner;


public class StudentUtil {
	
	public Student[] makeStudents() {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("학생 수를 입력하세요");
		int number= sc.nextInt();
		Student student[] = new Student[number];
		for (int i = 0; i < student.length; i++) {

			Student stu = new Student(); // 객체 메모리공간을 생성

			System.out.println("이름을 입력하세요.");
			stu.name=sc.next();
			System.out.println("번호를 입력하세요.");
			stu.num=sc.nextInt();
			System.out.println("국어점수를 입력하세요.");
			stu.kor=sc.nextInt();
			System.out.println("영어점수를 입력하세요.");
			stu.eng=sc.nextInt();
			System.out.println("수학점수를 입력하세요.");
			stu.math=sc.nextInt();
			stu.total = stu.kor + stu.eng + stu.math;
			stu.avg = stu.total / 3;

			student[i] = stu;//배열1칸씩 넣는 개념
		}
		return student;
	}

	public Student makeStudent() {
		//이름 번호 국어 영어 수학 입력받아 리턴
		Scanner sc = new Scanner(System.in);
		Student stu = new Student();
		System.out.println("이름을 입력하세요.");
		stu.name=sc.next();
		System.out.println("번호를 입력하세요.");
		stu.num=sc.nextInt();
		System.out.println("국어점수를 입력하세요.");
		stu.kor=sc.nextInt();
		System.out.println("영어점수를 입력하세요.");
		stu.eng=sc.nextInt();
		System.out.println("수학점수를 입력하세요.");
		stu.math=sc.nextInt();
		
		return stu;
		//string ,int 같이 리턴받으려면 방법
		//1.배열 사용 2.class사용
		
	
	}


}
