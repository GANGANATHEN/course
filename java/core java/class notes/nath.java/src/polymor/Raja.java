package polymor;

class Ram {
	void add(int a, int b,int d) {
		int c = a + b +d;
		System.out.println(c);
	}
}

class Raja extends Ram {

	void add(int a, int b) {
		int c = a + b;
		
		System.out.println(c);
		System.out.println("Good");
		super.add(20, 30,22);
	}

	public static void main(String[] args) {

		Raja r = new Raja();
		r.add(10, 20);
//		Ram v = new Ram();
//		v.add(0, 0);
	}

}
