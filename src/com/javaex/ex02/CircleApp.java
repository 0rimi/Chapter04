package com.javaex.ex02;

public class CircleApp {

	public static void main(String[] args) {
		
		CircleList cList = new CircleList();
		
		Circle c01 = new Circle(22);
		cList.add(c01);
		System.out.println(cList.get(0).toString());
		System.out.println(cList.size());
		
		Circle c02 = new Circle(23);
		cList.add(c02);
		System.out.println(cList.get(1).toString());
		System.out.println(cList.size());

	}

}
