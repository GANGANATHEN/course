package core.thread;

class Book extends Thread {
	public void run()  {  
		for(int i=0;i<=5;i++)
		System.out.println("Value is updating....");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
class Check extends Thread  {
	public void run() {
		for(int i=0;i<=5;i++)
		System.out.println("Works perfectly.....");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	}

public class Multithreading {


	public static void main(String[] args) { // thread
		Book book = new Book();
		Check check = new Check();
		Thread t1 = new Thread(book); //thread
		Thread t2 = new Thread(check);
//		book.update();
		t1.run();
		t1.setName( "booking");
		t1.setPriority(Thread.MAX_PRIORITY);
		
		if(t1.isAlive()) {
			System.out.println("Thread is running......");
		}
		t2.run();
		if(t2.isAlive()) {
			System.out.println("Thread 2 is running.....");
		}
		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(t1.isAlive()) {
			System.out.println("Thread is running......");
		}else {
			System.out.println("Thread 1 is complete......");
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(t2.isAlive()) {
			System.out.println("Thread is running......");
		}else {
			System.out.println("Thread 2 is complete......");
		}
		System.out.println("sleep");
		System.out.println(t1.getName());
		System.out.println(t1.getPriority());
		
		

	}

}