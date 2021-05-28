import java.util.*;
public class EncapsulationTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EncapsulationDemo ed = new EncapsulationDemo();
		System.out.println("Enter Employee Id, Name and Salary");
		ed.setId(sc.nextInt());
		ed.setName(sc.next());
		ed.setSalary(sc.nextDouble());
		
		System.out.println("EmpId : " + ed.getId());
		System.out.println("EmpName : " + ed.getName());
		System.out.println("EmpSalary : " + ed.getSalary());
	}

}
