package com.student;

public class Marks extends Student {
	private int m1, m2, m3;
	
	public Marks(int sno, String sname, int m1, int m2, int m3) {
		super(sno, sname);
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	
	public void display() {
		System.out.println("Sno : " + sno);
		System.out.println("Sname : " + sname);
		System.out.println("Sub Marks : " + m1 + " " + m2 + " " + m3);
		System.out.println("Total Marks : " + totalMarks());
	}
	
	public int totalMarks() {
		return m1 + m2 + m3;
	}
}
