package edu.paul.jf.looping;

public class LoopDoWhile {

	public static void main(String[] args) {
		int intLoop =0;
		System.out.println(intLoop);
		boolean isBoolean = true;
		String strSudahUrut= "Yes";
		
		do{
			intLoop++;
			
			if(intLoop==3)
			{
				strSudahUrut = "No";
			}			
			
			if(strSudahUrut.equals("No"))
			{
				isBoolean = false;				
			}
			break;
		}while(isBoolean);
		
	}
}
