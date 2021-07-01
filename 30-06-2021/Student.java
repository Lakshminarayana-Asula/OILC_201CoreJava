import java.util.*;
public class Student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Tution Fee: ");
		double tutionFee = sc.nextDouble();
		System.out.println("Enter Transportation Fee: ");
		double transFee = sc.nextDouble();
		System.out.println("Enter Examination Fee: ");
		double examFee = sc.nextDouble();
		
		double yearlyAmount = tutionFee + transFee + examFee;
		System.out.println("Yearly Amount is: " + yearlyAmount);
		System.out.println("Half Yearly amount is: " + yearlyAmount / 2);

	}

}
