
public class StringComparision {

	public static void main(String[] args) {
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("welcome");
		String str4 = new String("welcome");
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		System.out.println(str3 == str4);
		System.out.println(str3.equals(str4));

	}

}
