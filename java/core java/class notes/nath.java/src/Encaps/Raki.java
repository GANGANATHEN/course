package Encaps;

class Raj {
	private int empno;
	private int sno;

	public void setEmpo(int empno,int num) {
		this.empno = empno;
		sno = num;

	}

	public int getEmpo() {
		return sno;

	}

}

public class Raki {
	public static void main(String[] args) {
		Raj r = new Raj();
		r.setEmpo(123,1);
		int y = r.getEmpo();
		System.out.println(y);
	}
}
