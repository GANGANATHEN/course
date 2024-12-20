package Collectionsss;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class maaps {

	public static void main(String[] args) {
     //LinkedHashMap<Integer,String[]> ma = new LinkedHashMap<>();
     TreeMap<Integer,String[]> ma = new TreeMap<>();
     ma.put(1, new String[] {"yfd","jgf"});
     ma.put(1, new String[] {"nmhvg","jgf"});
     ma.put(2, new String[] {"yfd","kjgf"});
     ma.put(3, new String[] {"kjgy","kgg"});
     ma.put(4, new String[] {"hfd","jgf"});
     ma.get(2);
      System.out.println(ma.toString());
     System.out.println(ma.containsKey(3));
     for(String[] i :ma.values()) {
    	 for(String str : i) {
    		 System.out.println(str);
    	 }
    	 
     }
	}
}
