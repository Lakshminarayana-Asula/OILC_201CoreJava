import java.util.*;
public class CollatzSequence {
	static String output = "";
	static int count = 1;
	
	static String getSequence(int num) {
		output = output + num +" ";
		if(num == 1) {
			if(count < 100)
				return output;
			else
				return "Does Not Converge";
		}
		if(num % 2 == 0) {
			num = num / 2;
		}
		else {
			num = num * 3 + 1;
		}
		
		count++;
		return getSequence(num);	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		if (num < 0) {
			System.out.println("Error");
		}
		else 
			System.out.println(getSequence(num));
		//System.out.println(count);
	}
}
