package com.javaex.ex02;

public class CircleList {
	
	private Circle[] cArray;
	private int crtPos;
	
	
	public CircleList() {
		this.cArray = new Circle[2];
		this.crtPos = 0;
	}
	 
	
	public void add(Circle c) { //Circle의 하위애들
		cArray[crtPos] = c;
		crtPos++;
	}
	public Circle get(int i) { //주소줭
		Circle result = cArray[i]; //Circle주소줭
		return result;
	}
	public int size() {
		return crtPos;
	}
}
