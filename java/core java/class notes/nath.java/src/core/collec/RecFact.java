package core.collec;

public class RecFact {

	public static void main(String[] args) {
		int n = 5;
		int res = fact(n);
		System.out.println(res);

	}

	public static int fact(int n) {

		if (n == 1)
			return 1;
		else
			return (n * fact(n - 1));

	}

}
