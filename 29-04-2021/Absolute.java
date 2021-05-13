
public class Absolute {
	public static void main(String[] args) {
		try {
			int num = Integer.parseInt(args[0]);
			
			if(num < 0) {
				num = num * -1;
			}
			
			System.out.println(num);
		}
		catch(NumberFormatException e) {
			System.out.println("Please enter Integer values only");
		}
	}
}
