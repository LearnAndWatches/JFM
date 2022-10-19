package edu.paul.jf.oop;

public class TestEnum {

	public static void main(String[] args) {
		Dayz myVar = Dayz.SUNDAY;
		System.out.println(myVar);
		
		for(Dayz myVars : Dayz.values())
		{
			System.out.println(myVars);
		}
	}
}