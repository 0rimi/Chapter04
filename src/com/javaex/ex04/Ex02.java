package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex02 {
	
	public static void main(String[] args) {
		
		Integer i01 = new Integer(22);
		Integer i02 = new Integer(23);
		Integer i03 = new Integer(20);
		int i04 = 304;
		Integer i05 = new Integer(22);
		
		//기본자료형이더라도 클래스로 와야한다.
		//순서의 개념이 없다
		Set<Integer> iList = new HashSet<Integer>();
		iList.add(i01);
		iList.add(i02);
		iList.add(i03);
		iList.add(i04); //자동박싱
		iList.add(i05); //중복안됨.
		
		iList.remove(i05); //헐 ~ 같은값이라 없어짐~
		
		System.out.println("갯수 : "+iList.size());
		//for구문 쓰려고 보니 방번호가 없다..!
		//확장구문 써야함 Integer i값
		for( Integer i : iList ) {
			System.out.println(i.toString());
		}
		
		System.out.println("========================");
		//Point 관리
		Point p01 = new Point(0,1);
		Point p02 = new Point(5,53);
		Point p03 = new Point(9,43);
		Point p04 = new Point(0,1);
		
		Set<Point> pSet = new HashSet<Point>();
		pSet.add(p01);
		pSet.add(p02);
		pSet.add(p03);
		pSet.add(p04);
		
		System.out.println("갯수 : "+pSet.size());
		for( Point p : pSet ) {
			System.out.println(p.toString());
		}
		
		
	}

}
