package edu.paul.jf.variouslogic;

public class AkarKuadratJava {

	public static void main(String[] args) {
		double r = Math.sqrt(2);
		double d = r * r - 2;
		System.out.println("r * r "+(r*r));
		if(d==0)
		{
			System.out.println("sqrt(2) squared minus 2 is 0");
		}
		else
		{
			System.out.println("sqrt(2) squared minus 2 is not 0 but "+d);
		}
	}
}