package com.javaex.ex05;

public class Rectangle {
	
	//f
	private int width;
	private int heigth;
	
	//생
	public Rectangle() {
		super();
	}


	public Rectangle(int width, int heigth) {
		super();
		this.width = width;
		this.heigth = heigth;
	}

	//메gs
	public int getWidth() {
		return width;
	}


	public void setWidth(int width) {
		this.width = width;
	}


	public int getHeigth() {
		return heigth;
	}


	public void setHeigth(int heigth) {
		this.heigth = heigth;
	}

	//메일
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", heigth=" + heigth + "]";
	}
	
	public boolean equals(Object obj) {
		Rectangle r = (Rectangle)obj;
		if(this.width==r.width && this.heigth==r.heigth) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	
	

}
