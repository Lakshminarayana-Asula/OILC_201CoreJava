
public class DigitChecker {

	public static void main(String[] args) {
		String s=args[0];
		int a=Integer.parseInt(String.valueOf(s.charAt(0)));
		int b=Integer.parseInt(String.valueOf(s.charAt(1)));
		int c=a-b;
		System.out.println(Math.abs(c));
	}

}
