package Collectionsss;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queeees {

	public static void main(String[] args) {
     Queue<Integer> qu = new LinkedList<>();
		//PriorityQueue<Integer> qu = new PriorityQueue<>();
     qu.add(10);
     qu.add(3);
     qu.add(8);
     qu.add(5);
     qu.add(7);
     System.out.println(qu);
     System.out.println(qu.peek());
     System.out.println(qu.remove());
     qu.add(1);
     System.out.println(qu);
     System.out.println(qu.peek());
     System.out.println(qu.poll());
     System.out.println(qu);
     System.out.println(qu.contains(1));
     qu.offer(8);
     System.out.println(qu);
	}

}
