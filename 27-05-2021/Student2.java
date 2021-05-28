import java.util.*;
public class Student2 {
	public int studentId;
	public String studentName;
	private int marks;
	private String grade;
	
	String displayDetailes() {
		String output = "";
		output += "Student [name= " + studentName + "," + "studentId= " + studentId + "," + "marks= " + marks + "," + "grade= " + grade + "]";
		return output;
	}
	
	private void calculategrade() {
		if(marks < 35) {
			grade = "Fail";
		}
		else if (marks > 90) {
			grade = "A";
		}
		else if(marks > 80 && marks <= 90) {
			grade = "B";
		}
		else if(marks > 70 && marks <= 80) {
			grade = "C";
		}
		else if(marks > 60 && marks <= 70) {
			grade = "D";
		}
		else {
			grade = "E";
		}
	}
	
	Student2(int studentId, String studentName, int marks){
		this.studentId = studentId;
		this.studentName = studentName;
		this.marks = marks;
		calculategrade();
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student detailes (Id, name , marks): " );
		
		Student2 std = new Student2(sc.nextInt(), sc.next(), sc.nextInt());
		
		System.out.println(std.displayDetailes());

	}

}
