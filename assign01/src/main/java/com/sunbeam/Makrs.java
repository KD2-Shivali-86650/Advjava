package com.sunbeam;

public class Makrs {
	String subject;
	double Marks;
	
	public Makrs() {
		
	}
	
	public Makrs(String subject, double marks) {
		super();
		this.subject = subject;
		Marks = marks;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public double getMarks() {
		return Marks;
	}
	public void setMarks(double marks) {
		Marks = marks;
	}
	
	
	

}
