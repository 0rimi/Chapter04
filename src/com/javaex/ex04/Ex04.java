package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex04 {

	public static void main(String[] args) {

		Point p1 = new Point(12,5);
		Point p2 = new Point(9,13);
		Point p3 = new Point(8,14);
		Point p4 = new Point(8,14);
		
		Set<Point> pSet = new HashSet<Point>();
		pSet.add(p1);
		pSet.add(p2);
		pSet.add(p3);
		pSet.add(p4);
		
		System.out.println(p3.equals(p4));
		
		System.out.println(pSet.size());

	}

}
