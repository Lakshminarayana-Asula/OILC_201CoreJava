import java.util.*;
class Student{
	int sno;
	String sname;
	
	Student(int sno, String sname){
		this.sno = sno;
		this.sname = sname;
	}
	
	void display() {
		System.out.println("Sno : " + sno);
		System.out.println("Sname : " + sname);
	}
}

class Employee extends Student{
	int salary;
	int bonus;
	
	Employee(int sno, String sname, int salary, int bonus){
		super(sno, sname);
		this.salary = salary;
		this.bonus = bonus;
	}
	
	void display() {
		super.display();
		System.out.println("Salary: " + (salary + bonus));
	}
}

public class TestOverRidden {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sno, sname, salary, bonus: ");
		Employee e = new Employee(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt());
		e.display();

	}

}
