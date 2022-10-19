package edu.paul.jf.oop;

public class Kendaraan {

	public static void main(String[]args){
		  Car mobil = new Car("Pertalite");
		  String xPrint = "Bensin";
//		  System.out.print(mobil.getBahanBakar());
		  
		  mobil.warna();
		  mobil.mesin();
		  xPrint = "Aftur";
		  mobil.setBahanBakar("Pertamax");
		  System.out.println("bahannya : "+ mobil.getBahanBakar());

		  System.out.println("tahunn pembuatan : " +  mobil.getTahunPembuatan());
	 }
}