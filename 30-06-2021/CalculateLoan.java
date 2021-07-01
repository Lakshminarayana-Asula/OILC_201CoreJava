
public class CalculateLoan {

	public static void main(String[] args) {
		int amount = 100000;
		int interest = 7 * 2;
		double total = (amount * interest) / 100 + amount;
		System.out.println("Total amount: " + total);
		double monthlyAmount = total / 24;
		System.out.println("Monthly amount is: " + monthlyAmount);

	}

}
