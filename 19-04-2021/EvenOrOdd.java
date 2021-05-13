
public class EvenOrOdd {

	public static void main(String[] args) {
		try {
			int n=Integer.parseInt(args[0]);
			if(n%2==0)
				System.out.println("Even Number");
			else
				System.out.println("Odd Number");
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}
