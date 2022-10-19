package edu.paul.jf.branchinglogic;

public class IfCondition {
	public static void main(String args[])
	{
//		int num = 1;
//		int x = 0;
//		
//		if(num>2) 
//		{
//			
//			if(num < 1) 
//			{
//				x = 10 * num + 2;
//				System.out.println(x);
//				
//				if(num > 7) 
//				{
//					
//				}
//			}			
//			System.out.println("Tidak Terpenuhi !!");
//			System.out.print("Tidak Terpenuhihi !!");
//		}
//		else
//		{
//			if(num < 1) 
//			{
//				x = 10 * num + 2;
//				System.out.println(x);
//				
//				if(num > 7) 
//				{
//					
//				}
//			}			
//			System.out.println("Tidak Terpenuhi !!");
//			System.out.print("Tidak Terpenuhihi !!");
//		}
			
//		boolean isRemainderOn = true;
//		int j = 1200;
//		String strCuaca = "Hujan";
//		if(isRemainderOn || j<1000 && strCuaca.equals("cerah"))
//		{
//			
//		}
//		else if(!isRemainderOn || j>1000 || strCuaca.equals("Hujan"))
//		{
//			
//		}
//		else
//		{
//			
//		}
		
		boolean isRemainderOn = true;
		int j = 1200;
		String strCuaca = "Hujan";
		String strExec = "";
		//LIHAT DISINI
		if(isRemainderOn)
		{
			strExec = "1";
			System.out.print("INI TRUE REMINDER !!");
		}
		else if(j>1000 )
		{
			strExec = "2";
			System.out.print("INI J > 1000 !!");
		}
		else if(strCuaca.equals("Hujan"))
		{
			strExec = "3";
			System.out.print("SEKARANG SEDANG HUJAN !!");
		}
		else
		{
			strExec = "4";
			System.out.print("TIDAK ADA KONDISI YANG TERPENUHI");
		}
		
		System.out.println("Nilai strExec adalah : "+strExec);
		
		
		//LIHAT DISINI
		if(isRemainderOn)
		{
			strExec = "3";
			System.out.print("INI TRUE REMINDER !!");
		}
		else
		{
			System.out.print("INI J > 1000 !!");
		}
		
//		if(num > 2)
//		{			
//			
//			if(num < 1) {
//				x = 10 * num + 2;
//				System.out.println(x);				
//			}
//					
//		}	
//		else
//		{
//			
//			if(num > 5)
//			{
//				System.out.println("OK");
//			}	
//			System.out.println("Tidak Terpenuhi !!");
//			System.out.print("Tidak Terpenuhi !!");
//		}
	}
}