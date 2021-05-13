
public class Rounder {
	static String round(int n) {
		if(n % 2 == 0) {
			n = (n / 10 + 1) * 10;
			return "" + n;
		}
		else 
			return "" + n;
	}

	public static void main(String[] args) {
		try {
			int n = Integer.parseInt(args[0]);
			if(n < 0) {
				System.out.println(10/0);
			}
			System.out.println(round(n));
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
}
