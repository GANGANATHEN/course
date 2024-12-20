package Collectionsss;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;

class Product {
	int code,price;
	String name;
	Product(int code,String name,int price) {
		this.code= code;
		this.name = name;
		this.price = price;
		}
	public String toString() {
		return code + "\t" + name + "\t" + price;
	}
}

public class Listss {
	

	public static void main(String[] args) {
		Hashtable<Integer,Product> names = new Hashtable<Integer,Product>();
		names.put(10,new Product(9,"wewef",10));
		names.put(1,new Product(7,"wewef",100));
		names.put(2,new Product(16,"wef",333));
		names.put(3,new Product(4,"wettf",33));
		names.put(20,new Product(1,"wewef",100));
		names.put(15,new Product(6,"wewef",500));
//		Iterator it =  ((Object) names).iterator();
//		while(it.hasNext()) {
//			System.out.println(it.next().toString());
//		}
		for(int x : names.keySet()) {
			System.out.println(names.get(x).toString());
		}
      
	}

}
