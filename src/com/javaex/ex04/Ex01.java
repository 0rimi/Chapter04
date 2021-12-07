package com.javaex.ex04;

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;

public class Ex01 {

	public static void main(String[] args) {
		
		Point p01 = new Point(12,5);
		Point p02 = new Point(9,13);
		Point p03 = new Point(8,14);
		
		//add, get, remove, size
		
		List<Point> pList = new ArrayList<Point>();
		//List<Point> pList = new LinkedList<Point>();
		pList.add(p01); //ArrayList 위의 인터페이스 List의
		pList.add(p02);
		pList.add(p03);
		
		//갯수출력하기
		System.out.println(pList.size());

		//관련되고 있는 Point에 접근하기
		System.out.println(pList.get(1).getY());
		System.out.println(pList.get(0).toString());
		
		System.out.println("========================");
		//전체출력하기
		for(int i=0; i<pList.size(); i++) {
			System.out.println(pList.get(i).toString());
		}
		
		System.out.println("========================");
		//데이터 지우기
		pList.remove(p03);
		//pList.remove(2);
		System.out.println(pList.size());
		
		pList.add(2, p03);
		System.out.println(pList.size());
		
		System.out.println("========================");
		//향상된 for문 (처음부터 끝까지)ㄴ
		for( Point p : pList/*포인트 하나 : 전체값*/ ) {
			System.out.println(p.getX());
			System.out.println(p.getY());
		}
		
		
	}

}
