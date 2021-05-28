import java.util.*;
public class StudentDetailes {
	int sno;
	String sname;
	
	StudentDetailes(int sid, String ssname){
		sno = sid;
		this.sname = sname;
	}
	
	void display() {
		System.out.println("Sno : " + sno);
		System.out.println("Sname : " + sname);
	}
	
	public static void main(String[] args) {
		StudentDetailes stud[] = new StudentDetailes[5];
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i < stud.length; i++) {
			System.out.println("Enter " + (i + 1) + " Student detailes: ");
			stud[i] = new StudentDetailes(sc.nextInt(), sc.next());
		}
		
		for(int i = 0; i < stud.length; i++) {
			System.out.println((i + 1) + " student detailes are: ");
			stud[i].display();
		}

	}

}
