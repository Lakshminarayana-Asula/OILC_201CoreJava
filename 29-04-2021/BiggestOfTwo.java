
public class BiggestOfTwo {
	public static void main(String[] args) {
		if(args.length != 2) {
			System.out.println("Please pass Two arguments only");
			return;
		}
		
		String s = "";
		
		try {
			int firstNum = Integer.parseInt(args[0]);
			int secondNum = Integer.parseInt(args[1]);
			
			if(firstNum > secondNum) {
				s = "firstNum is Big";
			}
			else {
				s = "secondNum is Big";
			}
			
			System.out.println(s);
		}
		catch(NumberFormatException ne) {
			System.out.println("Please enter Integer values only");
		}
	}
}
