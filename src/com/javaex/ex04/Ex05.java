package com.javaex.ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex05 {
	
	public static void main (String[] args) {
		
		Map<String, Point> pMap = new HashMap<String, Point>();
		//포인트를 스트링으로 관리.
		
		Point p01 = new Point(12,5); //최수빈
		Point p02 = new Point(9,13); //최연준
		Point p03 = new Point(3,4); //최범규
		Point p04 = new Point(3,13);
		
		pMap.put("최수빈", p01);
		pMap.put("최연준", p02);
		pMap.put("최범규", p03);
		pMap.put("최범규", p04);
		//중복어는 안들어감
		
		//System.out.println(pMap.get("최수빈").getX());
		//System.out.println(pMap.size());
		//System.out.println(pMap);
		
		//키셋구하기
		Set<String> keyset = pMap.keySet();
		System.out.println(keyset);
		
		for( String key : keyset ) {
			System.out.println(pMap.get(key).getX());
		}
		
		//////////////////////////////////////////////
		Map<String, String> boardMap = new HashMap<String, String>();
		
		boardMap.put("Title", "안녕하세요. 최수빈입니다.");
		boardMap.put("regDate", "2019-03-04");
		boardMap.put("contents", "어느날 머리에서 뿔이 자랐다");
		
		System.out.println(boardMap.get("Title"));
		
		
	}
	
}
