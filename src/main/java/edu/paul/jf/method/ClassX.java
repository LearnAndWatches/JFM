package edu.paul.jf.method;

public class ClassX extends SuperClassX{
//	public class ClassX {
//public class ClassX {

	
	public float returnValue(float x)
	{
//		setStrS("AS");
//		System.out.println(strX);
		
		SuperClassX scx = new SuperClassX();
		
		return 4f*scx.passingValue(x);
	}
	
//	public void hue(String xClass)
//	{
//		System.out.println(xFunction(xClass));
//	}
	
	public void hue(String xClass)
	{
//		System syz = new System();
		System.out.print("");
		int x ;
//		SuperClassX scx ;
//		scx.xFunction(xClass);
	}
	
	public static void main(String args[])
	{
//		SuperClassX scx = new SuperClassX();
//		SuperClassX scx ;
//		System.out.println(scx.getStrS());
//		scx.setStrS("Aku STRS!!");
//		System.out.println(scx.getStrS());
//		System.out.print(scx.printAku());
		String xstring ="ini adalah xstring";

		System.out.println(xstring.substring(4));
		System.out.println(xstring.substring(0, xstring.length()-1));
	}
}