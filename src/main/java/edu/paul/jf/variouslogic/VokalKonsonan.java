package edu.paul.jf.variouslogic;

public class VokalKonsonan {

	public static void main(String[] args) {
		String huruf = "j";
		
		if(huruf.equals("a") || huruf.equals("i") || 
				huruf.equals("u") || huruf.equals("e") || huruf.equals("o"))
		{
			System.out.println(huruf+" adalah huruf vocal ");
		}
		else
		{
			System.out.println(huruf+" adalah huruf konsonan");
		}
	}
}