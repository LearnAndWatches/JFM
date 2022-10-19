package edu.paul.jf.branchinglogic;

public class IfAllTrue {

	public static void main(String[] args) {
		String sUser = "Paul";
		String sPassword = "Sesuai";
		
		if(sUser.length()>50)
		{
			System.out.println("Username Salah");
		}
		else if(sPassword.equalsIgnoreCase("Sesuai"))
		{
			System.out.println("Password Salah");
		}
		else
		{
			System.out.println("Login Berhasil");
		}
	}
}