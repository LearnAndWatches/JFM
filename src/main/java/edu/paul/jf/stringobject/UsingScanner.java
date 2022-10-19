package edu.paul.jf.stringobject;

import java.util.Scanner;

public class UsingScanner{
	
	public static void main(String[] args) {		
		
		Scanner sn = new Scanner(System.in);
		
		System.out.print("Masukkan String : ");
		String strFullScan = sn.nextLine();
		System.out.println("Print input Full scan : "+strFullScan );	
		System.out.println("==============================================");
		System.out.print("Masukkan Bilangan Bulat : ");
		int intScan = sn.nextInt();
		System.out.println("Print input Bilangan Bulat : "+intScan);
		System.out.println("==============================================");
		System.out.print("Masukkan Bilangan Desimal : ");
		double doubScan = sn.nextDouble();
		System.out.println("Print input Bilangan Desimal : "+doubScan);
		System.out.println("==============================================");
		//OBS
		//HANDBRAKE
	}
}