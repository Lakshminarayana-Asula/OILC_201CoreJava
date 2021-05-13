
public class OddRounder {
	static String oddRound(int n) {
		if(n<0) {
			return "Error";
		}
		if(n%2==0)
			return "Even Number";
		else {
			n = (n / 10 +1) * 10;
			return "" + n;
		}
	}
	public static void main(String[] args) {
		try {
			int n = Integer.parseInt(args[0]);
			System.out.println(oddRound(n));
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
}
