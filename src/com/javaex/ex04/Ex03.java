package com.javaex.ex04;

import java.util.HashSet;
import java.util.Set;

public class Ex03 {

	public static void main(String[] args) {

		Set<Integer> iSet = new HashSet<Integer>();

		while(true) {
			if(iSet.size()>=6) {
				//6개 이상 일것 같으면 탈출
				break;
			}
			int i = (int)(Math.random()*45)+1;
			System.out.println("생성된 숫자 : "+i);
			iSet.add(i); //중복체크는 Set으로 해결..
		}
		
		//System.out.println(iSet.size());
		System.out.println("=====================");
		for( Integer i : iSet ) {
			System.out.println(i.toString());
		}
		
		
	}

}
