package core.strings;

import java.util.Scanner;

public class Plinsir {
	public static void main(String[] args) {

		System.out.println("Enter a value  : ");
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse();
		String s2 = new String(sb);
		boolean b = s1.equals(s2);
		if (b) {
			System.out.println(" is  a palinrom ");
		} else {
			System.out.println(" is not  a palinrom ");

		}

	}

}
