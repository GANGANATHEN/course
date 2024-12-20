package core.thread;

class FirstCls extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Value is updating....");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}

	}
	public void Book() {
		System.out.println("Hi");
	}
}
class SecondCls extends Thread{
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Works perfectly.....");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		}

	}
}

public class Class1   {
	public static void main(String[] args) {
		
		FirstCls fs = new FirstCls();
		SecondCls ss = new SecondCls();
		Thread t1 = new Thread(fs);
		Thread t2 = new Thread(ss);
		t1.start();
		if(t1.isAlive()) {
			System.out.println("Thread is running......");
		}
		
		t2.start();
		
		t1.setName("super");
		t1.setPriority(Thread.MAX_PRIORITY);
		t1.run();
		if(t1.isAlive()) {
			System.out.println("Thread is running......");
		} else {
			System.out.println("Thread is dead");
		}
		t2.run();
		if(t2.isAlive()) {
			System.out.println("Thread is running......");
		} else {
			System.out.println("Thread is dead");
		}
		try {
			t1.join();
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}
		if(t1.isAlive()) {
			System.out.println("Thread is running......");
		} else {
			System.out.println("Thread is dead");
		}
		try {
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(t2.isAlive()) {
			System.out.println("Thread is running......");
		} else {
			System.out.println("Thread is dead");
		}
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println(t1.getPriority());
		


	}
	

}
