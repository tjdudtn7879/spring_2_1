package com.lgy.spring_test;

public class MainClass {
	public static void main(String[] args) {
//		MainClass 클래스가 Calculation 클래스에 의존
		Calculation calculation=new Calculation();
//		Calculation 클래스로 객체 생성해서 값을 주입
//		의존+주입(Dependency Injection) : DI
		calculation.setFirstNum(10);
		calculation.setSecondNum(2);
		
		calculation.add();
		calculation.sub();
		calculation.mul();
		calculation.div();
	}
}
