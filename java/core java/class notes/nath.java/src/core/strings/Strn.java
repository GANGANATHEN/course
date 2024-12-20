package core.strings;

import java.util.Scanner;

public class Strn {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		System.out.println("Enter a Value  :");
		StringBuffer s1 = new StringBuffer(in.nextLine());
		String s2 =" ";
		for(int i=s1.length()-1; i>=0;i--) {
			char c = s1.charAt(i);
		    s2+=c;
	
		}
		 System.out.println(s2);
		 if(s1.equals(s2)) {
			 System.out.println(s1 + " is a palinrom ");
		 }else {			 
			 System.out.println(s1 + " is not a palinrom ");
		 }
//		for(String s3 : s2) {
		 
//		System.out.println(s3);
//		}
		 
	}

}
