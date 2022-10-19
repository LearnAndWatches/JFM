package edu.paul.jf.oop;

public class Manager extends Karyawan{

	public String departemen;
	
	public Manager(String name, String alamat , String departemen) {
		super(name,alamat);
		this.departemen = departemen;
	}

	
	
	public static void main(String args[])
	{
		System.out.println(gaji);
	}
}