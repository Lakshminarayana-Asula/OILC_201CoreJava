
public class EvenOrOdd {
	static String isCheck(int n) {
		String x ;
		if(n % 2 == 0)
			x = "Even Number";
		else
			x = "Odd Number";
		return x;
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
