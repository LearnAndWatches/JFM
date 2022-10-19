package edu.paul.jf.variouslogic;

public class RumusLuasSegitiga {

	public static void main(String[] args) {
		luasSegitiga(4,6);
	}
	
	private static void luasSegitiga(int alas , int tinggi) 
	{
		double luas = 0.5 * alas * tinggi;
		System.out.println(luas);
	}
}