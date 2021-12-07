package com.javaex.ex03;

//T -->Point Circle
public class MyList<T> { //잘바바 꺽쇠
	
	private T[] oArray; //잘보라구 꺽쇠
	private int crtPos;
	
	
	public MyList() {
		this.oArray = (T[])new Object[3]; //<배열형변환
		this.crtPos = 0;
	}
	
	
	
	public void add(T obj) {
		oArray[crtPos] = obj;
		crtPos++;
	}
	public T get(int i) {
		T result = oArray[i];
		return result;
	}
	public int size() {
		return crtPos;
	}

}
