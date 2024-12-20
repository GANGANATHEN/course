package core.userdine;

interface Myinterface {
	void get_data();

	void set_data() throws AgeException;
}

public class Exdemo {
	public static void main(String[] args)  {
		Employee emp = new Employee();
		try {
		
		emp.set_data();
		} catch(AgeException e) {
			System.out.println(e);
		}
		emp.get_data();
	}
}

