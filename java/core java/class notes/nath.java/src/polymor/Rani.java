package polymor;

class Ramni {
	int h = 45;

	void m1(int a, int b) {
		int c = a + b;
		System.out.println(c);

	}
}

public class Rani extends Ramni {
	void m1(int a, int b) {
		int c = a + b;
		System.out.println(c);
		System.out.println("welcome....");
		super.m1(10, 20);
		System.out.println(super.h);

	}

	public static void main(String[] args) {
		Rani r = new Rani();
		r.m1(12, 23);
	}

}
