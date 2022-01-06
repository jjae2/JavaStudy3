package com.prac.s2.constructor;

public class Car {
	String brand;
	String company;
	int cc;
	String color;

	public Car() {
		this("k9");///2번 생성자를 사용
//		this.company = "KIA";
//		this.brand = "k9";
//		this.cc = 500;
//		this.color="black";

	}

	public Car(String brand) {
		this(brand,"gray");//3번 생성자를 사용
//		this.company = "KIA";
//		this.brand = brand;
//		this.cc = 500;
//		this.color="black";
	}
	public Car(String brand,String color) {
		this.company = "KIA";
		this.brand = brand;
		this.cc = 500;
		this.color=color;
	}
	public Car(String brand,String color,int cc) {
		this.company = "KIA";
		this.brand = brand;
		this.cc = cc;
		this.color=color;/// 오버로딩으로 생성자도 여러개 만들 수 있다.
	}

	

	public void info() {
		System.out.println("멤버 메서드 ");
		System.out.println(this.company);
		System.out.println(this.brand);
		System.out.println(this.cc);
		System.out.println(this.color);
	}
}
