import java.util.Scanner;

public class Pattern13 {
	
	static String createStarPattern(int num) {
		String out = "";
		
		for(int i = 1; i <= num ;i++) {
			for(int j = 1;j <= i;j++) {
				out += "* ";     
			}
			out += "\n";
		}
		
		return out;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many stars want to print:");
		int num = sc.nextInt();
		System.out.println(createStarPattern(num));
	}

}
