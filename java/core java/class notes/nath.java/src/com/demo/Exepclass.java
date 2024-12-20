package com.demo;

public class Exepclass {

	public static void main(String[] args) {
		System.out.println("Good");

		try {
		int arr[] = {1,2,4,5,6};
		System.out.println(arr[11]);
		} 
		
		catch(ArithmeticException e) {
			System.out.println("hi");
		}
		catch(ArrayIndexOutOfBoundsException ae) {
			System.out.println("bye");
		} catch(Exception ee) {
			System.out.println("see you");
		}
	
		
	}

}
