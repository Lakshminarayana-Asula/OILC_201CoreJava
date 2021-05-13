
public class ThreeDPalindrome {

	public static void main(String[] args) {
		String s=args[0];
		int n=s.length();
		String x="";
		x=x+s.charAt(n-1)+s.charAt(n-2)+s.charAt(n-3);
		System.out.println(s.equals(x));
	}

}
