package com.prac.s1.student;

public class Student {
	 String name;
	 int num;
	 int kor;
	 int eng;
	 int math;
	int total;
	double avg;///데이터 저장 용도
	
	public void makeTotal() {
		int total=0;
		this.total=kor+eng+math;
		this.avg=this.total/3.0;
	}


}
