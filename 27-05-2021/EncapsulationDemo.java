
public class EncapsulationDemo {
	private int empId;
	private String empName;
	private double salary;
	
	public void setId(int id) {
		empId = id;
	}
	
	public void setName(String name) {
		empName = name;
	}
	
	public void setSalary(double sal) {
		salary = sal;
	}
	
	public int getId() {
		return empId;
	}

	public String getName() {
		return empName;
	}
	
	public double getSalary() {
		return salary;
	}
}
