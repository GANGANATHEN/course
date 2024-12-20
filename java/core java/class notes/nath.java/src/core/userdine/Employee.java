package core.userdine;

import java.util.Scanner;

class AgeException extends Exception {

	String msg;

	AgeException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public String toString() {
		return "AgeException" + msg;
	}
}

public class Employee implements Myinterface {
	Scanner in = new Scanner(System.in);
	Scanner inc = new Scanner(System.in);
	int id;
	String name;
	String department;
	int salary;
	int age;

	Employee() {

	}

	Employee(int id, String name, String department, int salary, int age) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.age = age;
	}

	public void set_data() throws AgeException {

		System.out.println("Enter Id : ");
		id = in.nextInt();
		System.out.println("Enter Name : ");
		name = inc.nextLine();
		System.out.println("Enter Department: ");
		department = inc.nextLine();
		System.out.println("Enter Salary : ");
		salary = in.nextInt();
		System.out.println("Enter Age : ");
		age = in.nextInt();
		if (age < 18 || age > 58) {
		throw new AgeException("Age is not applicable");
	}

		//setAge();
	}

//	public void setAge() throws AgeException {
//		System.out.println("Enter Age : ");
//		age = in.nextInt();
//		if (age < 18 || age > 58) {
//			throw new AgeException("Age is not applicable");
//		}
//	}

	public void get_data() {
		System.out.println("Id : " + id);
		System.out.println("Name : " + name);
		System.out.println("Department : " + department);
		System.out.println("Salary : " + salary);
		System.out.println("Age : " + age);
	}

}
