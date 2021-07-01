import java.util.*;
public class CheckCustomers {

	static String checkCust(String cust1, String cust2) {
		String res = "Not Validated";
		String[] str1 = cust1.split(" ");
		String[] str2 = cust2.split(" ");
		
		if(str1[0].equals(str2[0])) {
			res = "Validated";
		}
		
		return res;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Customer Name");
		String cust1 = sc.nextLine();
		System.out.println("Enter Second Customer Name");
		String cust2 = sc.nextLine();
		
		System.out.println(checkCust(cust1, cust2));
	}

}
