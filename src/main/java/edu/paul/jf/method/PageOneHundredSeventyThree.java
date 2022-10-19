package edu.paul.jf.method;

public class PageOneHundredSeventyThree {
	static float tCelsius = 3; 

	public static void main(String[] args) {
		
		int intXY = 3;
		
		float mainFloat = convertCelsius(8f);
		System.out.println(mainFloat);		
		
		scoring();		
		validation();
		checking();
		noReturnMethod();
	}
	
	static float convertCelsius(float tCelsius) 
	{
		ClassX cX = new ClassX();
		
		return 3f*cX.returnValue(tCelsius);
	}
	
	static void noReturnMethod()
	{
		System.out.println("Value X adalah X");
	}
	
	//
	static void validation()
	{
		//start process 1
		System.out.println("Proses eksekusi 40 baris statement 1 !!");
		//end process 1
	}
	
	static void checking()
	{
		//start process 2 
		System.out.println("Proses eksekusi 40 baris statement 2 !!");
		//end process 2 
	}
	static void scoring()
	{
		System.out.println("Proses eksekusi 40 baris statement 3 !!");
	}
}