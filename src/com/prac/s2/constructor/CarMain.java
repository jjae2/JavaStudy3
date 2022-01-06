package com.prac.s2.constructor;


public class CarMain {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.info();
		Car car2 = new Car("k5");
		car2.info();
		Car car3 = new Car("제네시스","blue");
		car3.info();
		Car car4 = new Car("k3","red",2000);
		car4.info();
	}
	
}
