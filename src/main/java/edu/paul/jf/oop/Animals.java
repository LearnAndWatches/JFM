package edu.paul.jf.oop;

public abstract class Animals {

	private String nama;

	public Animals(String nama) {
		this.nama = nama;
	}

	public String getNama() {
		return nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}
	
	public abstract void suara();
	
}