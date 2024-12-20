package core.exhan;

import java.util.Scanner;

public class Excpcls3 {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
		int x, y, z;
		int[] arr = { 12,13,14 };
		System.out.println("Enter a X value : ");
		x = in.nextInt();
		System.out.println("Enter a Y value : ");
		y = in.nextInt();
		//System.out.println(x / y);
		try {
			z = x / y;
		} catch (ArithmeticException e) {
			while (y == 0) {
				System.out.println(e.toString());
				System.out.println("Enter non Zero value of Y : ");
				y = in.nextInt();
			}
			z = x / y;
		}
		System.out.println(z);
		try {
			System.out.println(arr[12]);
		} catch (ArrayIndexOutOfBoundsException ae) {
			System.out.println(arr[1]);

		}

	}

}
