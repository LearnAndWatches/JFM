package edu.paul.jf.branchinglogic;

import edu.paul.jf.oop.Dayz;

public class SwitchCase {

	public static void main(String[] args) {
		
		
		String strTrue = "A";
		Dayz hari = Dayz.FRIDAY;
		switch(hari)
		{
			case MONDAY:
				System.out.println("Ini satu ");break;
			case WEDNESDAY:
				System.out.println("Ini dua ");break;
			default : 
				System.out.println("Selain satu dan dua");break;
		}
		
//		for ( int i = 0; i < 5; i++ ) {				
////			System.out.println("Proses ke-i : "+i);
//				if(i==3)
//				{
//					System.out.println("Proses ke-i : "+i);
//					break;					
//				}
//				System.out.println("Proses ke-i : "+i);
//		}		
//		  
//	    //CONTINUE
//	    for (int i = 1; i <= 10; i++) { 
//	      if (i == 5) { 
//	        continue; 
//	      }
//	      System.out.println(i + " + " + i + " = "+ (i+i));
//	    }
	}
}