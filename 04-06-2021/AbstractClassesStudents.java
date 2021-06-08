import java.util.*;
abstract class Student{
	String studentName;
	String studentClass;
	protected static int totalNoOfStudents;
	abstract double getPercentage();
	
	static int getTotalNoOfStudents() {
		return totalNoOfStudents;
	}
	
	Student(){
		this.studentName = null;
		this.studentClass = null;
	}

	public Student(String studentName, String studentClass) {
		this.studentName = studentName;
		this.studentClass = studentClass;
	}

}

class ScienceStudent extends Student{
	int physicsMarks;
	int chemistryMarks;
	int mathsMarks;
	
	public ScienceStudent(String studentName, String studentClass, int physicsMarks, int chemistryMarks, int mathsMarks) {
		super(studentName, studentClass);
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathsMarks = mathsMarks;
	}
	

	@Override
	public String toString() {
		return "ScienceStudent [studentName= " + studentName + ", studentClass= " + studentClass + ", physicsMarks= " + physicsMarks + ", chemistryMarks= " + chemistryMarks + ", mathsMarks= "
				+ mathsMarks + ", Percentage= " + getPercentage() + "]";
	}

	double getPercentage() {
		int total = physicsMarks + chemistryMarks + mathsMarks;
		double percentage = total / 3;
		
		return percentage;
	}
}

class HistoryStudent extends Student{
	int historyMarks;
	int civicsMarks;
	
	public HistoryStudent(String studentName, String studentClass, int historyMarks, int civicsMarks) {
		super(studentName, studentClass);
		this.historyMarks = historyMarks;
		this.civicsMarks = civicsMarks;
	}
	
	public String toString() {
		return "ScienceStudent [studentName= " + studentName + ", studentClass= " + studentClass + ", historyMarks= " + historyMarks + ", civicsMarks= " + civicsMarks + ", Percentage= " + getPercentage() + "]";
	}
	
	double getPercentage() {
		int total = historyMarks + civicsMarks;
		double percentage = total / 2;
		
		return percentage;
	}	
}

public class AbstractClassesStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter StudentName, StudentClass, Marks(Physics, Chemistry, Maths)");
		Student s = new ScienceStudent(sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		System.out.println(s);
	}

}
