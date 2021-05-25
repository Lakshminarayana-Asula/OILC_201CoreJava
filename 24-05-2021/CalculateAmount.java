import java.util.*;
public class CalculateAmount {

	static int pizzaOrder(int num) {
		int amount = 0, cost, discount;
		cost = num * 300;     // Pizza cost = 300;
		discount = (cost * 20) / 100;
		amount = cost - discount;
		
		return amount;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter How many pizzas want to order ");
		int num = sc.nextInt();
		
		System.out.println("Total Price is : \n" + pizzaOrder(num));
	}

}
