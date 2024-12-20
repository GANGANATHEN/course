package core.abst;

abstract class Manar {
	abstract void m1();

	public abstract void m2();
}

abstract class Tamil extends Manar {

	void m1() {
		System.out.println("good");
	}

	abstract void m3();

}

class Mami extends Tamil {

	public void m2() {
		System.out.println("Wow");
	}

	void m3() {
		System.out.println("Very Good");
	}

	public static void main(String[] args) {
		Mami r = new Mami();
		r.m1();
		r.m2();
		r.m3();
	}
}