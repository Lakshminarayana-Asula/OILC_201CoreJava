import java.util.Scanner;

public class StudentDetailes {
	static void displayMarks(int[] sub) {
		System.out.println("Student Marks are:");
		
		for(int i = 0;i < sub.length;i++) {
			System.out.print(sub[i]+" ");
		}
		
	}
	
	static boolean isPass(int[] sub) {
		boolean b = true;
		for(int i = 0;i < sub.length;i++) {
			if(sub[i] < 35) {
				b = false;
				break;
			}
		}
		
		return b;
	}
	
	static int total(int[] sub) {
		int total = 0;
		
		for(int i = 0;i < sub.length;i++) {
			total += sub[i];
		}
			
		return total;
	}
	
	static String findGrade(int[] sub) {
		int total = total(sub);
		int avg;
		String result = "";
		avg = total / sub.length;
			
		if(avg >= 75) {
			result += "A Grade";
		}
		else if(avg >= 60 && avg < 75) {
			result += "B Grade";
		}
		else if(avg >=50 && avg < 60) {
			result += "C Grade";
		}
		else {
			result += "D Grade";
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sub = new int[5];
		System.out.println("Enter student subject marks");
		
		for(int i = 0;i < sub.length;i++) {
			sub[i] = sc.nextInt();
		}
		
		if(isPass(sub)) {
			displayMarks(sub);
			System.out.println("\nTotal: " + total(sub));
			System.out.println("Grade : " + findGrade(sub));
		}
		else {
			System.out.println("FAIL");
		}
	}

}
