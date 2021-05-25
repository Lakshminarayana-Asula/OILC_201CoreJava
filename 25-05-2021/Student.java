import java.util.*;
public class Student {
	static Scanner sc = new Scanner(System.in);
	int sno;
	String sname;
	int sub[];
	
	void accept(int sid, String name, int size) {
		this.sno = sid;
		this.sname = name;
		this.sub = new int[size];
		
		System.out.println("Enter Marks: ");
		for(int i = 0; i < size; i++) {
			sub[i] = sc.nextInt();
		}
	}
	
	void display() {
		System.out.println("Student id: " + this.sno);
		System.out.println("Student name: " + this.sname);
		System.out.println("Student Marks are : ");
		for(int i = 0; i < sub.length; i++) {
			System.out.println(sub[i] + " ");
		}
		
		System.out.println(findGrade());
	}
	
	boolean isPass() {
		boolean b = true;
		for(int i = 0; i < sub.length; i++) {
			b = true; 
			
			if(sub[i] < 35) {
				b = false;
				break;
			}
			
		}
		
		return b;
	}
	
	int totalMarks() {
		int total = 0;
		for(int i = 0; i < sub.length; i++) {
			total += sub[i];
		}
		
		return total;
	}
	
	String findGrade() {
		String result = "\nStatus: ";
		if(isPass()) {
			result += "Total: " + totalMarks() + "\n";
			int avg = totalMarks() / sub.length;
			
			if(avg >= 90) {
				result += "A Grade";
			}
			else if(avg >= 80 && avg < 90) {
				result += "B Grade";
			}
			else if(avg >= 70 && avg < 80) {
				result += "C Grade";
			}
			else if(avg >= 60 && avg < 70) {
				result += "D Grade";
			}
			else {
				result += "E Grade";
			}
		}
		else {
			result += "Fail";
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		System.out.println("Enter student id : ");
		int sid = sc.nextInt();
		System.out.println("Enter Student name: ");
		String name = sc.next();
		System.out.println("Enter Number of Subjects");
		int size = sc.nextInt();
		s.accept(sid, name, size);
		s.display();
		

	}

}
