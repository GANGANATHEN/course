package core.strings;

public class Palin {
	public static void main(String[] args) {
		String s = "doctor";
		char[] x = s.toCharArray();
		System.out.println(x);
		int i=0; int j = x.length-1;
		while(i<j) {
			char m = x[i];
			x[i] = x[j];
			x[j] = m;
			i++;
			j--;
		}
		System.out.println(x);
	}
	

}
