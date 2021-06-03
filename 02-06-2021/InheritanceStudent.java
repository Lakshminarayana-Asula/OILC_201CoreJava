import java.util.*;
class Student1{
	int studentId;
	String name;
	double examFee;
	double totalFee;
	
	Student1(){
		this.studentId = 1;
		this.name = null;
		this.examFee = 0;
	}

	public Student1(int studentId, String name, double examFee) {
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getExamFee() {
		return examFee;
	}

	public void setExamFee(double examFee) {
		this.examFee = examFee;
	}
	
	public double payFee(double amount) {
		examFee -= amount;
		return examFee;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", Exam Fee=" + examFee + "]";
	}
	
	public String display() {
		return this.toString();
	}
	
}

class DayScholar extends Student1{
	double transportFee;

	public DayScholar() {
		this.transportFee = 0;
	}
	
	public DayScholar(int studentId, String name, double examFee, double transportFee) {
		super(studentId, name, examFee);
		this.transportFee = transportFee;
		totalFee = super.examFee + transportFee;
	}
	
	public double payFee(double amount) {
		super.totalFee -= amount;
		return totalFee;
	}

	@Override
	public String toString() {
		return "DayScholar [transportFee=" + transportFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + " Total Fee: " + totalFee + "]";
	}

	public String display() {
		return this.toString();
	}
}

class Hosteller extends Student1{
	double hostelFee;
	
	public Hosteller() {
		this.hostelFee = 0;
	}

	public Hosteller(int studentId, String name, double examFee, double hostelFee) {
		super(studentId, name, examFee);
		this.hostelFee = hostelFee;
		totalFee = super.examFee + hostelFee; 
	}
	
	public double payFee(double amount) {
		super.totalFee -= amount;
		return totalFee;
	}

	@Override
	public String toString() {
		return "Hosteller [hostelFee=" + hostelFee + ", studentId=" + studentId + ", name=" + name + ", examFee="
				+ examFee + " Total Fee: " + totalFee + "]";
	}

	public String display() {
		return this.toString();
	}
}

public class InheritanceStudent {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter StudentId, name, examfee, transportfee");
		DayScholar ds = new DayScholar(sc.nextInt(), sc.next(), sc.nextDouble(), sc.nextDouble());
		ds.payFee(1000);
		System.out.println(ds);
	}

}
