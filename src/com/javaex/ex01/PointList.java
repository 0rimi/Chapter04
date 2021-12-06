package com.javaex.ex01;

public class PointList {
	

	//필드
	private Point[] pArray; 	//Point에 주소넣는 배열
	private int crtPos;			//주소방번호

	

	//생성자
	public PointList() {
		this.pArray = new Point[3]; //배열셋팅
		this.crtPos = 0;
	}
	
	
	
	//메소드 g/s
	//crtPos <의 세터를 만들면 임의로 주소방값을 변경할수가 있으니 안만듬
	
	
	
	//메소드 일반
	public void add(Point p) { //주소 p를 가져오니까 Point p
		pArray[crtPos] = p;
		crtPos++;
	}
	public Point get(int index) {
		Point result = pArray[index];
		return result;
	}//방번호에 따른 Point의 pArray의 주소를 get.(주소를 향하는)
	public int size() {
		return crtPos;
	}//지금까지총몇개?
	
	
}
