import java.util.*;
public class CalculateInterest {

	static double calculateInterest(int roi, double amount) {
		double total = 0;
		
		total = (amount * roi ) / 100 + amount;
		
		return total;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Deposit amount");
		double amount = sc.nextDouble();
		System.out.println("Enter rate of Interest: ");
		int rof = sc.nextInt();
		
		System.out.println("Total amount: " + calculateInterest(rof, amount));

	}

}
