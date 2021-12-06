package com.javaex.ex01;

public class PointApp {

	public static void main(String[] args) {
		
		Point p01 = new Point(12,5);
		Point p02 = new Point(9,13);
		
		/*
		System.out.println(p01.toString());
		System.out.println(p02.toString());
		*/
		
		PointList pList = new PointList();
		//관리하는 PointList라는 클래스
		pList.add(p01); //pList의 메소드add이용, p01추가
		pList.add(p02);
		System.out.println(pList.get(0).getX());
		System.out.println(pList.get(1).getX());
		
		System.out.println(pList.size());
		
		Point p03 = new Point(8,14);
		pList.add(p03);
		
		System.out.println(pList.size());
		

	}

}
