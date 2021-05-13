
public class LeaseNumber {

	public static void main(String[] args) {
		try {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			if(a<b)
				System.out.println(a);
			else
				System.out.println(b);
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}
