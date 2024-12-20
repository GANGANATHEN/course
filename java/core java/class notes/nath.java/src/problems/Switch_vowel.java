package problems;

import java.util.Scanner;

public class Switch_vowel {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a Letter : ");
		char ch = in.next().charAt(0);
		
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println(ch + " is a Vowel Letter ");
			break;
		default:
			System.out.println(ch + " is  Not a Vowel Letter ");

		}

	}

}
