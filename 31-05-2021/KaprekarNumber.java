import java.util.*;

public class KaprekarNumber {

	static String isKaprekarNumber(int num) {
		String res = "";
		
		if (num < 0) {
			res += -1;
		}
		else if (num == 0) {
			res += -2;
		} 
		else {
			int square = num * num;

			String str = Integer.toString(square);
			int len = str.length();
			int quo = len / 2;
			String first = str.substring(0, quo);
			String second = str.substring(quo);

			int total = Integer.parseInt(first) + Integer.parseInt(second);
			if (num == total) {
				res = "True";
			} else {
				res = "False";
			}
		}

		return res;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any Number: ");
		int num = sc.nextInt();

		System.out.println(isKaprekarNumber(num));
	}

}
