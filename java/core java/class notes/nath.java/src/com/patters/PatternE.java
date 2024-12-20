package com.patters;

public class PatternE {
	public static void main(String[] args) {
		int val;
		for(int i=1;i<=5;i++) {
			val=i%2==0?0:1;
			for(int j=1;j<=i;j++) {
				System.out.print( val + " ");
				val= val==0?1:0;
			}
			System.out.println();
		}
	}
}
