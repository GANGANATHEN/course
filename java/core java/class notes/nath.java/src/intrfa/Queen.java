package intrfa;

interface King {
	int a = 37;

	void m1();

	abstract void m2();

}

public class Queen implements King {
	public void m1() {
		System.out.println("good");
	}

	public  void m2() {
		System.out.println("Well");
	}

	public static void main(String[] args) {
		Queen r = new Queen();
		//int a =43;
		r.m1();
		r.m2();
		System.out.println(a);
	}
}
