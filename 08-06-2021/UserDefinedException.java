
class NoAmountException extends Exception{
	public NoAmountException(String name) {
		super(name);
	}
}

public class UserDefinedException extends RuntimeException{
	static private double balance = 100;
	
	static void withdraw(double amount) {
		try{
			if(amount < balance) {
				balance = balance - amount;
			}
			else {
				throw new NoAmountException("Insufficient Funds Exception");
			}
		}
		catch(NoAmountException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		withdraw(400);

	}

}
