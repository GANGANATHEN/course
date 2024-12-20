package core.thread;

public class Example {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 0;
		try {
		int c = a/b;
		} catch(Exception e) {
		b= 2;
		int c = a/b;
		System.out.println(c);
         System.out.println(e);
		}
		
	}

}
