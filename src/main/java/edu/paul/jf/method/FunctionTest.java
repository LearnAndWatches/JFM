package edu.paul.jf.method;

public class FunctionTest {

	private int x ;
	private int y ;
	
	FunctionTest(int intX, int intY)
	{
		this.x = intX;
		this.y = intY;
	}
	FunctionTest()
	{
		
	}
	public static void main(String[] args) throws InterruptedException {
		FunctionTest fT = new FunctionTest();
		fT.getX("yaaaaah!!");
		
		Thread.sleep(50000);
	}
	
	public void getX(String strX) {
		System.out.println("INI OK "+strX);
		getY("Yaah");
	}
	public void getY(String strY) {
		System.out.println("INI TIDAK OK "+strY);
	}
}