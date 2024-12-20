package intrfa;

interface E {

}

interface D {

}

interface C extends D {
	int add(int a, int b);

}

abstract class Tamil {
	abstract int area(int a, int b);
}


class B extends Tamil implements C, E {
	public int add(int a, int b) {
		return a + b;
	}

	int area(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		B r = new B();
		int h = r.add(10, 20);
		System.out.println(h);
		int g = r.area(4, 6);
		System.out.println(g);
	}
}