package edu.paul.jf.basicprogramming;

public class ExplicitCastingPlus {
	public static void main(String args[])
	{
//		(Formula Long ke byte -(128-(a%128))
		 short s =  -124;
		  char c = 124; // OK, no compile time error
		  char d = (char) -124; // NOT OK, compile time error since char cannot hold -ve values
		  char e = 's'; // NOT OK, compile time error since a short might have -ve values which char won't be able to hold
		  char f = (char)s; // OK, type casting. The negative number  Pertama24 gets converted to 65412 so that char can hold it
		  System.out.println((short)f); //  Pertama24, gets converted back to a number short can hold because short won't be able to hold 65412
		  System.out.println((int)f); // 65412, gets converted to 65412 because int can easily hold it.  
	}
}
//https://stackoverflow.com/questions/37782536/why-is-casting-to-short-to-char-is-a-narrowing-conversion