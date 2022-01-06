package com.prac.s1.same;

public class Square {
	int garo;
	int sero;
	
	
	public boolean same(Square s) {
		//멤버변수 garo랑 매개변수로 받은 객체의 garo랑같고
		//sero도 같으면 true 하나라도 틀리면 false를 리턴
		if(this.sero==s.garo&&this.sero==s.sero) {
			return true;
		}
		
		return false;
	}
}
