package edu.paul.jf.branchinglogic;

public class CobaProgram {

	public static void main(String[] args) {
//		char x = 107;
//		System.out.println(x);
		int x=10;
		if(x<10)
		{
			if(x=='k')
			{
				System.out.println("1");
			}
			else
			{
				System.out.println("2");
			}
		}
		else
		{
			if(x%2==0)
			{
				System.out.println("3");
			}
			else
			{
				System.out.println("4");
			}
		}

	}
}