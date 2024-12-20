package com.demo;

public class Square extends RectangleSolid{
	private int g;

	public Square(int l, int b, int h,int g) {
		super(l, b, h);
		this.g=g;
		
	}
	public void mul() {
		super.det();
	System.out.println(g);
	}
	

}
