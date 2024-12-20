package problems;

import java.util.Scanner;

public class Str_Vowel {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int vowels = 0;
		int Non_vowels = 0;
		
		System.out.println("Enter a Words : ");
		String s = in.nextLine();
		
		for(int i=0;i<s.length();i++) {
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch =='i'|| ch == 'o'
			|| ch == 'u' || ch == 'A' || ch == 'E'|| ch == 'I'
			|| ch == 'O' || ch == 'U') {
				vowels ++;
			}else
				Non_vowels ++;
		}
		System.out.println("The Vowels Count is  : " + vowels);
		System.out.println("The non_Vowels Count is : " + Non_vowels );
	}

}
