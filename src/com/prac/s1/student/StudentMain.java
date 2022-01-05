package com.prac.s1.student;

public class StudentMain {

	public static void main(String[] args) {
		// makeStudent 호출
		StudentUtil studentUtil = new StudentUtil();
		Student student[]=studentUtil.makeStudents();
		
		for(int i=0;i<student.length;i++) {
			Student stu=student[i];
	System.out.println("이름은:::"+stu.name);
	System.out.println("번호는:::"+stu.num);
	System.out.println("국어점수는:::"+stu.kor);
	System.out.println("영어점수는:::"+stu.eng);
	System.out.println("수학점수는:::"+stu.math);
		}
		
		
		
		System.out.println("종-료");
}
}
