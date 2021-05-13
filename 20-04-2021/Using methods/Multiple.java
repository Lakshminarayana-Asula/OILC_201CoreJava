
public class Multiple {
	static String multiple(int n) {
		n = (n / 100 + 1) * 100;
		return "" + n;
	}
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		System.out.println(multiple(n));
	}
}
