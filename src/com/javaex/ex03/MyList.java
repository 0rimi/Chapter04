package com.javaex.ex03;

public class MyList {
	
	private Object[] oArray;
	private int crtPos;
	
	
	public MyList() {
		this.oArray = new Object[3];
		this.crtPos = 0;
	}
	
	
	
	public void add(Object obj) {
		oArray[crtPos] = obj;
		crtPos++;
	}
	public Object get(int i) {
		Object result = oArray[i];
		return result;
	}
	public int size() {
		return crtPos;
	}

}
