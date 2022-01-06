package com.prac.s1.student;

import java.util.Scanner;

public class StudentController {
	public void start() {
		StudentUtil su = new StudentUtil();
		StudentView sv = new StudentView();
		su.initUtil();
		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		Student students[] = null;
		while (check) {
			System.out.println("1. 학생들의 정보 입력");
			System.out.println("2. 학생들의 정보 출력");
			System.out.println("3. 학생정보 검색 출력");
			System.out.println("4. 프로그램 종료");
			int select = sc.nextInt();
			switch (select) {
			case 1:
				students = su.makeStudents();
				break;
			case 2:
				if (students != null) {
					sv.viewStudents(students);
				} else {
					sv.viewMessage("학생정보를 먼저 입력하세요");
				}
				break;
			case 3:
				
				if(students==null) {
					sv.viewMessage("학생 정보가 없습니다.");
					continue;
				}
				Student student=su.search(students);
				 if(students!=null) {
					sv.viewStudent(student);
				}else {
					sv.viewMessage("검색 결과 없습니다");
				}
				 break;
			default:

				check = false;
				break;
			}
		} // 와일끝
	}// 메인끝
}// 클래쓰끝
