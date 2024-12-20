package Encaps;

class Rasi{
	int  a=14;
	Rasi(int k){
		super();
		System.out.println(k);
	}
	Rasi (boolean b){
		this(40);
		System.out.println(b);
	}
}
class Arvi extends Rasi {
	Arvi (float x){
		super(true);
		System.out.println(x);
	}

	Arvi (int m){
		this(42.32f);
		System.out.println(m);
	}
	public static void main(String[] args) {
		Arvi a1 = new Arvi(44);
		System.out.println(a1.a);
		
	}
}
