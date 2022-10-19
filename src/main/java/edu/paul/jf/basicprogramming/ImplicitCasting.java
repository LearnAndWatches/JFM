package edu.paul.jf.basicprogramming;

public class ImplicitCasting {
	
	public static void main(String[] args){ 
	    short dataFirst = 457; 
	    double doubleData = dataFirst; //short ke double 
	    char dataSecond = 'W'; 
	    long longData = dataSecond;//char ke long 
	    int dataThird = 456; 
	    float floatData = dataThird;// int ke float 
	    byte dataFourth = 127; 
	    long longDataSecond = dataFourth;//byte ke long 
	    float dataFifth = 565.3f; 
	    double doubleDataSecond = dataFifth;//float ke double
	    
	    // ALT + SHIFT + D
	    //poroses hit komponen TextField 1
	    System.out.println("Float ke Double : "+doubleDataSecond );
	    
	  //poroses hit combobox  2
	    System.out.println("Short ke Double : "+ doubleData);
	    
	  //poroses input table C
	    System.out.println("Char ke Long : "+longData);
	    
	  //poroses input table D
	    System.out.println("Int ke Float : "+floatData);
	    
	  //poroses input table E
	    System.out.println("Byte ke Long : "+longDataSecond);	    
  }
}