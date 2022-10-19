package edu.paul.jf.method;

public class SuperClassX {

	private String strX ;
	private String strY ;
	private String strZ ;
	private String strW;	
	private String strS ;
	private String strP ;
	
	
	public String getStrP() {
		return strP;
	}

	public void setStrP(String strP) {
		this.strP = strP;
	}

	public String getStrS() {
		return strS;
	}

	public void setStrS(String strS) {
		this.strS = strS;
	}

	public String getStrW() {
		return strW;
	}

	public void setStrW(String strW) {
		this.strW = strW;
	}

	public SuperClassX()
	{
		this.strS = "1022333";
	}
	
	public SuperClassX(String x,String y,String z) {
		this.strX = x;
		this.strY = y;
		this.strZ = z;
	}

	String xFunction(String paramA)
	{
		strX = paramA;
		
		return strX;
	}

	public float passingValue(float x)
	{
		return 5f*x;
	}
	
	String printAku()
	{
		return "AKU SUDAH TERPRINT !!";
	}
}
