package polymor;

// Method Loding........................

public class Ramu {
	int area (int a,int b) {
		return (a*b);
	}
	static float area(float a,float b) {
		return(a+b);
		
	}
 public static void main(String[] args) {
	Ramu r = new Ramu();
	float k = r.area(10.2f, 20.2f);
	System.out.println(k);
}
}
