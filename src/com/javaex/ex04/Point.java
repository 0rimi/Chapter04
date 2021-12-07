package com.javaex.ex04;

public class Point {
	
	private int x;
	private int y;
	
	
	public Point() {}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	//메소드일반
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}	
	@Override
	public int hashCode() {		
		return this.x+this.y;
	}
	@Override
	public boolean equals(Object obj) {
		if(this.x==((Point)obj).getX()
				&& this.y==((Point)obj).getY()) {
			return true;	
		}
		else {	
			return false;
		}
	}
	

}
