
public class ThreeDPolindrome {
	static String polindrome(String s) {
		int n =Integer.parseInt(s);
		int x=n/100;
		int y=n%10;
		return "" + (x==y);
	}
	public static void main(String[] args) {
		System.out.println(polindrome(args[0]));
	}

}
