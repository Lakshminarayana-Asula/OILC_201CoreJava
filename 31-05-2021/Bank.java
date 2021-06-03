import java.util.*;

public class Bank {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer firstName and lastName ");
		Customer c1 = new Customer(sc.next(), sc.next());
		System.out.println("Enter AccountNo, balance, interestrate");
		Account ac1 = new Account(sc.nextInt(), c1, sc.nextDouble(), sc.nextDouble());
		ac1.deposit(2000);
		System.out.println(ac1);
	}

}

class Customer {
	private String firstName;
	private String lastName;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;

	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Customer() {
		this.firstName = null;
		this.lastName = null;
	}

	public Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + "]";
	}

}

class Account {
	Customer customer;
	double balance;
	int accountNo;
	double interestRate;

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	public Account(){
		customer = null;
		balance = 100;
		accountNo = 0;
		interestRate = 0;
	}

	public Account(int accountNo, Customer customer, double balance, double interestRate){
		this.accountNo = accountNo;
		this.customer = customer;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public void deposit(double amount) {
		double x = amount;
		balance = balance + amount;
	}

	public void withdraw(double amount) {
		if (amount < balance) {
			balance = balance - amount;
		} 
		else {
			return;
		}
	}

	@Override
	public String toString() {
		return "Account [customer=" + customer + ", balance=" + balance + ", accountNo=" + accountNo + ", interestRate="
				+ interestRate + "]";
	}
	
	

}
