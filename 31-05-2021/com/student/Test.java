package com.student;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student id, name, Marks(m1, m2, m3) ");
		
		Marks m = new Marks(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextInt());
		m.display();
	}
}
