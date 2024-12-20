package core.basics;

import java.util.Scanner;

public class Arr {
	public static void main(String[] args) {
         t();
	}

	static void t() {
		int arr[];
		arr=new int[5];
		
		Scanner in = new Scanner(System.in);
		
		for(int i=0;i<arr.length;i++) {
			
			
			System.out.println("ENTER VALUE : " + i);
			arr[i]=in.nextInt();
			
		}
		
		
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			
			sum=sum+arr[i];
		}
		
		System.out.println("total sum is " + sum);
		
	}
}
