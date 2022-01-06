package com.prac.s2.constructor;

public class Engine {
String name="V1";
String fuel="F1"; //직접대입방법
{
	System.out.println("초기화불럭");//초기화 블럭방법
	this.name="V2";
	this.fuel="F2";  //처음에는 V1,F1 만들어졌다가
					//초기화 블럭이 만들어지면서 V2,F2로 바뀐다
}
public Engine() {
	System.out.println("생성자 실행");//생성자 방법
	this.name="V3";
	this.fuel="F3";
}


public void info() {
	System.out.println(this.name);
	System.out.println(this.fuel);
}

}
