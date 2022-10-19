package edu.paul.jf.basicprogramming;

public class RectangleImpl {
	
	public static void main(String args[])
	{
		int umur = 81;
		Rectangle kotak = new Rectangle(20.0, 30.0);
		
		System.out.println(kotak);
		System.out.println(kotak.getSize());
//		Rectangle duplikatKotak = new Rectangle(20.0, 30.0);
		Rectangle duplikatKotak = kotak;
		duplikatKotak.setSize(80.0,90.0);

		System.out.println(kotak.getSize());
		System.out.println(duplikatKotak.getSize());
	}
}