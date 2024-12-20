package com.demo;

public class RectangleSolid extends Shape {

	private int h;

	RectangleSolid(int l, int b, int h) {
		super(l, b);
		this.h = h;

	}

	public void det() {
		
		super.show_det();
		System.out.println(h);
	}
}
