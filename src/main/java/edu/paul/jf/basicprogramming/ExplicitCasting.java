package edu.paul.jf.basicprogramming;

public class ExplicitCasting {
	public static void main(String[] args){ 
//		  short dataFirst = 3; 
//		  char charData = (char) dataFirst; //short ke char 
//		  long dataSecond = 246467;
		  long dataSecond = 10000;
		  byte byteData = (byte) dataSecond;//long ke byte 
//		  int dataThird = 34;
//		  char charDataSecond = (char) dataThird;// int ke char 
//		  char dataFourth = '1'; 
//		  short shortDataSecond = (short) dataFourth;//char ke short 
//		  double dataFifth = 3451214515.3; 
//		  float floatDataSecond = (float) dataFifth;//double ke float 
//		  System.out.println("Short ke Char : "+ charData);
		  System.out.println("Long ke Byte : "+byteData);
//		  System.out.println("Int ke Char : "+charDataSecond); 
//		  System.out.println("Char ke Short : "+shortDataSecond);    
//		  System.out.println("Double ke Float : "+floatDataSecond);		  
//		  System.out.println(246447%256);
		  
		  int a = (128-(10000%128));
		  System.out.println(a);
	}
}