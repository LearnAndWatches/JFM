package edu.paul.jf.oop;

public class Car {

	private String bahanBakar;
	  int tahunPembuatan = 2000;

	  Car(String bahanBakar){
	  	this.bahanBakar= bahanBakar;
	  }
	  void warna(){
	 	 System.out.println("berwarna merah");
	  }
	  void mesin(){
	  	System.out.println("bermesin 1800 cc");
	  }
	  
	  void setBahanBakar(String xBB)
	  {
		  this.bahanBakar = xBB;
	  }
	  int getTahunPembuatan(){
	  	return tahunPembuatan;
	  }
	  String getBahanBakar(){
	  	return bahanBakar;
	  }
}