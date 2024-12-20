package core.oopsInherit;

//inheritance......................



class Arr {

	int a = 10;

	void m1() {
		System.out.println("good");
	}
}

class Ra extends Arr {
	int b = 20;

	void m2() {
		System.out.println("well");
	}

	public static void main(String[] args) {
		// Arr r = new Arr();
		Ra r1 = new Ra();
		System.out.println(r1.a);
		r1.m2();
        r1
        .m1();
		System.out.println(r1.b);

	}

}
