package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {
		
		Circle c01 = new Circle(00);
		Circle c02 = new Circle(99);
		Point p01 = new Point(12,9);
		Point p02 = new Point(15,13);
		
		MyList<Circle> cList = new MyList<Circle>();
		
		MyList<Point> pList = new MyList<Point>();
		
		cList.add(c01);
		cList.add(c02);
		System.out.println(cList.get(1).getRadius());
		System.out.println(cList.size());
		
		pList.add(p01);	
		pList.add(p02);
		//System.out.println(pList.toString());
		System.out.println(pList.size());

	}

}
