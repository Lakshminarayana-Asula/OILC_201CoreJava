import java.util.*;
public class Employee {
	int empId;
	String name;
	double salary;
	
	void accept(int empId, String name, double salary) {
		this.empId = empId;
		this.name = name;
		this.salary = salary;
	}
	
	void display() {
		System.out.println("Employee detailes are: ");
		System.out.println("EmpId: " + empId);
		System.out.println("EmpName: " + name);
		System.out.println("Salary: " + salary);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		
		System.out.println("Enter Employee detailes");
		System.out.println("Enter EmpId: ");
		int empId = sc.nextInt();
		System.out.println("Enter Emp name: ");
		String name = sc.next();
		System.out.println("Enter Emp salary: ");
		double sal = sc.nextDouble();
		
		e.accept(empId, name, sal);
		e.display();
		
	}

}
