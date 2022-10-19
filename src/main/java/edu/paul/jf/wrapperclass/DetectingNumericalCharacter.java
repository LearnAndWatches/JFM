package edu.paul.jf.wrapperclass;

public class DetectingNumericalCharacter {

	public static void main(String[] args) {
		Character number = '1';
		System.out.println(Character.isDigit(number));
		
		Character hurup = 'b';
		System.out.println(Character.isDigit(hurup));
	}
}