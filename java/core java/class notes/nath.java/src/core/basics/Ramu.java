package core.basics;

public class Ramu {
	float m1() {
		float a = 24.36f;
		return(a+10);
	}
	

	public static void main(String[] args) {
		int y = (int) new Ramu().m1();
		System.out.println(y);

	}

}
