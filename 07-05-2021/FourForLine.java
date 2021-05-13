import java.util.Scanner;

public class FourForLine {
	
	static String getFourForLine(int num) {
		String out = "";
		
		for(int i = 1; i <= num ;i++) {
			out += i + " ";
			if(i % 4 == 0) {
				out += "\n";
			}
		}
		
		return out;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many stars want to print:");
		int num = sc.nextInt();
		System.out.println(getFourForLine(num));
	}
}
