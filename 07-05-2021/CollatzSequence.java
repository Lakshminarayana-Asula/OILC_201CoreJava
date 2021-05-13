import java.util.*;
public class CollatzSequence {
	static String output ="";
	static String getSequence(int num) {
		output = output + num +" ";
		
		if(num == 1) {
			return output;
		}
		else if(num % 2 == 0) {
			num = num / 2;
		}
		else {
			num = num * 3 + 1;
		}
		
		return getSequence(num);	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		
		System.out.println(getSequence(num));
	}
}
