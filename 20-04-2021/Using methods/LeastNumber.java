
public class LeastNumber {
	static String leastFind(int a, int b) {
		if(a < b)
			return "" + a;
		else
			return "" + b;
	}
	public static void main(String[] args) {
		try {
			int a = Integer.parseInt(args[0]);
			int b = Integer.parseInt(args[1]);
			System.out.println(leastFind(a , b));
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}

