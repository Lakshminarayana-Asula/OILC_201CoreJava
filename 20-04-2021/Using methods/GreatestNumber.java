
public class GreatestNumber {
	static String greatestFind(int a,int b) {
		if(a>b)
			return "" + a;
		else
			return "" + b;
	}
	public static void main(String[] args) {
		try {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			System.out.println(greatestFind(a,b));
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}
