package edu.paul.jf.oop;

public class Parent {
	public String name; 
	public String address; 

	public Parent(String name, String address) { 
	this.name = name; 
	this.address = address; 
	} 
	
	public void print() { 
	System.out.println(name+","+address); 
	} 

}