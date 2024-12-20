package core.abst;
 abstract class May{
	int a = 48;
	abstract void m1();
	
	
}
public class Malar extends May{
	int b = 28;
	public static void main(String[] args) {
		May r = new Malar();
		System.out.println(r.a);
		r.m1();
	}
	@Override
	void m1() {
	  System.out.println("good");	}

}

