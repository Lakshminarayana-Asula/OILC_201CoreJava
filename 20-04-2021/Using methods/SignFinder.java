
public class SignFinder {
	static String signCheck(int n) {
		if(n>0)
			return "Positive Value";
		else if(n<0) 
			return "Negative Value";
		else
			return "Zero";
	}
	public static void main(String[] args) {
		try{
			int n=Integer.parseInt(args[0]);
			System.out.println(signCheck(n));
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}
}
