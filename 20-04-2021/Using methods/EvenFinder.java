
public class EvenFinder {
	static String isCheck(int n) {
		return "" + (n%2 == 0);
	}
	public static void main(String[] args) {
		try {
			int n = Integer.parseInt(args[0]);
			System.out.println(isCheck(n));
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}
