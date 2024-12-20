package core.oopsInherit;
 class A_ {

	int a = 12;

	void m1() {
		System.out.println("good");
	}
}

class B extends A_ {

	int b = 25;

	void m2() {
		System.out.println("nice");
	}
}
class Mul extends B {
	int c=48;
	void m3() {
		System.out.println("Wow");
	}
	
public static void main(String[] args) {
	
	Mul m = new Mul();
	m.m2();
		System.out.println(m.c);
	m.m1();
	System.out.println(m.b);
	m.m3();
	System.out.println(m.a);
	
	
	
}
}
