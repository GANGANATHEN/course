package polymor;
class Vei{
	int a =40;
	public Vei() {
		System.out.println("GOod"); 
	}
}
public class Ramme extends Vei {
	int b=80;
	public Ramme() {
		super();
		System.out.println("nice");
		
	}
	public static void main(String[] args) {
		Ramme r = new Ramme();
		System.out.println(r.b);
		System.out.println(r.a);
		
	}

}
