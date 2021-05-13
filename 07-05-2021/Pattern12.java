import java.util.*;
public class Pattern12 {
	
	static String display(int rows) {
		String output = "";
		
		for(int i = 1;i <= rows;i++) {
			int x = i;
			for(int j = 1;j <= i;j++) {
				output += x+" ";
				x = x + i;
			}
			output += "\n";
		}
		
		return output;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many rows want to print:");
		int rows = sc.nextInt();
		System.out.println(display(rows));
	}

}
