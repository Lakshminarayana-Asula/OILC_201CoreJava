
public class SumOfDigits {
	static String sum(int a, int b) {
		return "" + (a + b);
	}
	public static void main(String[] args) {
		String s=args[0];
		int a=Integer.parseInt(String.valueOf(s.charAt(0)));
		int b=Integer.parseInt(String.valueOf(s.charAt(1)));
		System.out.println(sum(a,b));
	}
}
