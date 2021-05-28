import java.util.*;
class Employee{
	private int empId;
	private String empName;
	private double salary;
	
	Employee(int empId, String empName, double salary ){
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
	}
	
	public int hashCode() {
		return empId;
	}
	
	public boolean equals(Object obj) {
		Employee e = (Employee)obj;
		
		return this.empId == e.empId && this.empName == e.empName && this.salary == e.salary;
		
	}
	
	public String toString() {
		String res = "";
		res += "Empid : " + empId + "\n";
		res += "EmpName : " + empName + "\n";
		res += "salary : " + salary + "\n";
		return res;
	}
}

public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Id, Name, salary");
		Employee os = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
		Employee os1 = new Employee(sc.nextInt(), sc.next(), sc.nextDouble());
		System.out.println(os);

	}

}
