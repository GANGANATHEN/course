package core.oopsInherit;
// Basic to inherit
class A {
	
	int a=10;
	void m1() {
		System.out.println("good");
	}
}

class Raja {
	int b = 20;

	void m2() {
		System.out.println("well");
	}

	public static void main(String[] args) {
		A r = new A();
		Raja r1 = new Raja();
	//	System.out.println(r.a);
		r1.m2();
		r.m1();
		System.out.println(r1.b);

	}

}
