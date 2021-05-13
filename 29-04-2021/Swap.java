
public class Swap {
	
	static String output = "";
	
	static String withTemporary(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
		output = "swapping two numbers using Temporary variable  \n" + "num1 : " + num1 + "\n" + "num2 : " + num2;
		return output;
	}

	static String withoutTemporary(int num1, int num2) {
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		output = "swapping two numbers Without using Temporary variable  \n" + "num1 : " + num1 + "\n" + "num2 : " + num2;
		return output;
	}
	
	public static void main(String[] args) {
		int num1 = 5, num2 = 10;
		System.out.println(withTemporary(num1, num2));
	//	System.out.println(withoutTemporary(num1, num2));
	}
}
