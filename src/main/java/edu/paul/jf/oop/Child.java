package edu.paul.jf.oop;

public class Child extends Parent {
	public String dob; 
	public Child(String name, String address, String dob) { 
	super(name, address); //Instantiate superclass 
	this.dob = dob; 
	} 
	public void print() { 
		super.print(); 
		//called method print() at superclass 
		System.out.println(dob); //dob at subclass 
	}
}