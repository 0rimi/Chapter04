package com.javaex.ex03;

public class MyListApp {

	public static void main(String[] args) {
		
		Object c01 = new Circle(00);
		Object c02 = new Circle(99);
		
		MyList cList = new MyList(); //하나로..!
		cList.add(c01);
		cList.add(c02);
		System.out.println(cList.get(0));
		System.out.println(cList.size());
		
		
		Object p01 = new Point(12,9);
		
		MyList pList = new MyList();
		pList.add(p01);	
		System.out.println(pList.size());

	}

}
