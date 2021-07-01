package com.Bank;
import java.util.*;

public class BankApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Customer> li = new ArrayList();
		
		System.out.println("Enter Customer Detailes: ");
		for(int i = 1; i <= 5 ; i++) {
			System.out.println("Enter " + i + " account detailes(id, name, amount): "); 
			Customer c = new Customer(sc.nextInt(), sc.next(), sc.nextDouble());
			li.add(c);
		}
		
		for(Customer c : li) {
			if(c.getBalance() < 10000 ) {
				System.out.println(c);
			}
		}

	}

}
