package problems;

public class TowerOfHonai {
	
	void toh(int n,int a,int b,int c) {
		
		if(n>0) {
			toh(n-1,a,c,b);
			System.out.println("Move a Disc from " + a + " to " + c);
			toh(n-1,b,a,c);
		}
	}
	
	public static void main(String[] args) {
		TowerOfHonai t1 = new TowerOfHonai();
		t1.toh(3, 1, 2, 3);
	}

}
