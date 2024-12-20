package core.basics;

public class Rana {

	void m1(int a) {
		System.out.println("int");
	}
	void m1(float b) {
		System.out.println("float");
	}
	void m1(double c) {
		System.out.println("double");
	}
	public static void main(String[] args) {
		Rana n = new Rana();
		n.m1(12.1);
	}
}
