package Collectionsss;

import java.util.ArrayList;
import java.util.Collections;

class Sportsman implements Comparable<Sportsman> {
	int id;
	String name;
	long score;
	
	
	public Sportsman(int id, String name, long score) {
		this.id = id;
		this.name = name;
		this.score = score;
	}
	Sportsman(){
	
	}
	@Override
	public String toString() {
		return id+ "\t"+name +"\t" +score;
	}
	public int compareTo(Sportsman o) {
//		if(this.id>o.id) {
//			return 1;
//		} else {
//			return -1;
//		}
		return name.compareTo(o.name);
		
	}
	
	
}



public class Compareess {

	
		public static void main(String[] args) {
			ArrayList<Sportsman> alist = new ArrayList<Sportsman>();
			alist.add(new Sportsman(12,"Sachin",100));
			alist.add(new Sportsman(7,"Dhoni",77));
			alist.add(new Sportsman(18,"Kholi",101));
			alist.add(new Sportsman(45,"Rohit",50));
			
			Collections.sort(alist,new Sortbyname());
			Collections.sort(alist,new Sortbyid());
			for(Sportsman sp:alist) {
				System.out.println(sp);
			}

	

}
