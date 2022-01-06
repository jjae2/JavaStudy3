package com.prac.s1.student;

public class StudentMain {

	public static void main(String[] args) {
//		StudentView sv = new StudentView();
		// String msg = "하이요";
		// sv.viewMessage(msg);
		//-------
		// Student stu= new Student();
		// stu.name="안재이";
		// stu.num=10;
		// stu.kor=80;
		// stu.eng=90;
		// stu.math=100;
		// sv.viewStudent(stu);
		//-------
//		Student students[] = new Student[2];
//		Student stu = new Student();
//		stu.name = "안재이";
//		stu.num = 10;
//		stu.kor = 80;
//		stu.eng = 90;
//		stu.math = 100;
//		students[0] = stu;
//		stu = new Student();
//		stu.name = "재이";
//		stu.num = 20;
//		stu.kor = 40;
//		stu.eng = 80;
//		stu.math = 50;
//		students[1]=stu; ///그림 그려서 블로그 작성
//		//sv.viewStudents(students);
//		
//		StudentUtil su = new StudentUtil();
//		
//		Student student2=su.search(students);
//		if(students !=null) {
//		sv.viewStudent(student2);
//		}else {
//			sv.viewMessage("학생이 없다");
//		}
//		System.out.println("종료");
//		------------
		StudentController sc = new StudentController();
		sc.start();

		
	
		}

}
