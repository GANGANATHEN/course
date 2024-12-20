package core.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Define the Stud class
public class Stud {
    private String name;
    private String bpay; // basic pay
    private String salary;

    public Stud() {
        // Default constructor
    }

    public Stud(String name, String bpay, String salary) {
        this.name = name;
        this.bpay = bpay;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBpay() {
        return bpay;
    }

    public void setBpay(String bpay) {
        this.bpay = bpay;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Stud [name=" + name + ", bpay=" + bpay + ", salary=" + salary + "]";
    }

    // Comparator class for sorting by name
    static class Sname implements Comparator<Stud> {
        @Override
        public int compare(Stud o1, Stud o2) {
            return o1.getName().compareToIgnoreCase(o2.getName());
        }
    }

    public static void main(String[] args) {
        List<Stud> students = new ArrayList<>();
        students.add(new Stud("Binoth", "60000", "720000"));
        students.add(new Stud("Aamkumar", "30000", "360000"));

        System.out.println("before Sorting.................");
        System.out.println(students);
        
        System.out.println("\n");
        // Sort students by name using the comparator
        Collections.sort(students, new Sname());
        System.out.println("After Sorting.................");
        System.out.println(students);

        System.out.println("================================================");

        // Print sorted students
        for (Stud student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Basic Pay: " + student.getBpay());
            System.out.println("Salary: " + student.getSalary());
            System.out.println();
        }
    }
}
