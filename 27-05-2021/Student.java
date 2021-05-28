
public class Student {
	int sno;
	String sname;
	
	Student(int sno, String sname){
		this.sno = sno;
		this.sname = sname;
		System.out.println("Two Parameterised Constructor");
	}
	
	void display() {
		System.out.println("Sno : " + sno);
		System.out.println("Sname : " + sname);
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(1, "Lachi");
		s1.display();
		Student s2 = new Student(2, "Siva");
		s2.display();

	}

}
