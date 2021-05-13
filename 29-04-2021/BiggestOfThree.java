
public class BiggestOfThree {
	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("Please pass 3 arguments only");
			return;
		}

		try {
			int bigNum = Integer.parseInt(args[0]);
			int nextNum = Integer.parseInt(args[1]);
			
			if(bigNum < nextNum) {
				bigNum = nextNum;
			}
			
			nextNum = Integer.parseInt(args[2]);
			
			if(bigNum < nextNum) {
				bigNum = nextNum;
			}
			
			System.out.println("Big num: " + bigNum);
		}
		catch(NumberFormatException ne) {
			System.out.println("Please enter Integer values only");
		}
	}
}
