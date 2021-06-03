package com.student;

public class Student {
	public int sno;
	public String sname;
	
	public Student() {
		System.out.println("Default Constructor");
	}
	
	public Student(int sno, String sname) {
		this.sno = sno;
		this.sname = sname;
	}
	
	public void display() {
		System.out.println("Sno : " + sno);
		System.out.println("Sname : " + sname);
	}
}
