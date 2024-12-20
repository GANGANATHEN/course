package polymor;
// method overridding.........................

class Ran{
	void m1(int a, int b) {
		int c = a+b;
		System.out.println(c);
	}

static void m2() {

	System.out.println("good");
}
}

public class Ramg extends Ran {
	
	void m1(int a, int b) {
		int c = a+b;
		System.out.println(c);
		System.out.println("Well Done.");
	}

public static void main(String[] args) {
	Ran r = new Ran();
	r.m1(12, 23);
	r.m2();
	
}
}
