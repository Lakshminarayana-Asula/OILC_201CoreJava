
public class DigitChecker {
	static String digitCheck(String s) {
		int a = Integer.parseInt(String.valueOf(s.charAt(0)));
		int b = Integer.parseInt(String.valueOf(s.charAt(1)));
		return "" + (Math.abs(a - b));
	}
	public static void main(String[] args) {
		String s = args[0];
		System.out.println(digitCheck(s));
	}
}
