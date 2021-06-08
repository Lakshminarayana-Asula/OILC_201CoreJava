import java.util.*;

class InsufficientFundsException extends Exception {
	InsufficientFundsException(String exp) {
		super(exp);
	}
}

class NegativeAmountValue extends Exception {
	NegativeAmountValue(String exp) {
		super(exp);
	}
}

class CheckingAccount {
	int accountNo;
	double balance;

	CheckingAccount(int accountNo, double balance) {
		this.accountNo = accountNo;
		try {
			if(balance <= 0) {
				throw new NegativeAmountValue("Enter correct Amount");
			}
			else {
				System.out.println("Account was Created Successfully");
				this.balance = balance;
				System.out.println("Total balance is: " + balance);
			}
		}
		catch(NegativeAmountValue na) {
			System.out.println(na);
		}
		
	}

	boolean checkAccount(int accountNo) {
		boolean b = false;

		if (accountNo == this.accountNo) {
			b = true;
		}

		return b;
	}

	void deposit(int accountNo, double amount) {
		
		if (checkAccount(accountNo)) {
			try {
				if (amount <= 0) {
					throw new NegativeAmountValue("Enter correct Amount: ");
				}
				else {
					System.out.println("Deposited " + amount + " Successfully");
					this.balance += amount;
					System.out.println("Total Balance in account: " + balance);
				}
			} 
			catch (NegativeAmountValue na) {
				System.out.println(na);
			}
		}
		else {
			System.out.println("Invalid accountNumber");
		}
		
	}

	double withdraw(int accountNo, double amount) {
		
		if (checkAccount(accountNo)) {
			try {
				if (amount > balance) {
					throw new InsufficientFundsException("Insufficient Amount");

				} 
				else {
					balance -= amount;
					System.out.println("Withdrawl " + amount + " Successfully");
				}
			} 
			catch (InsufficientFundsException ie) {
				System.out.println(ie);
			}

		}
		else {
			System.out.println("Invalid AccountNumber");
		}
		
		return balance;
		
	}
	
}

public class BankDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter accountNo and Amount");
		CheckingAccount ca = new CheckingAccount(sc.nextInt(), sc.nextDouble());
		while(true){
			System.out.println("1. Deposit\n2. Withdrawl\n3. Exit\nSelect an option: ");
			int opt = sc.nextInt();
		
			switch(opt) {
				case 1:
					System.out.println("Enter accountNo and amount to deposit");
					ca.deposit(sc.nextInt(), sc.nextDouble());
					break;
				case 2:
					System.out.println("Enter accountNo and amount for withdrawl");
					System.out.println("Remaining balance in account: " + ca.withdraw(sc.nextInt(), sc.nextDouble()));
					break;
				case 3:
					System.exit(0);
			}
			
		}
	}

}
