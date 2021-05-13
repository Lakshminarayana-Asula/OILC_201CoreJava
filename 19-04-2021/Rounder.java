
public class Rounder {

	public static void main(String[] args) {
		try {
			int n=Integer.parseInt(args[0]);
			if(n<0) {
				System.out.println(10/0);
			}
			if(n%2==0)
				System.out.println((n/10+1)*10);
			else 
				System.out.println(n);
		}
		catch(Exception e) {
			System.out.println("Error");
		}
	}

}
