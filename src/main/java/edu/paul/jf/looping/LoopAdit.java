package edu.paul.jf.looping;

import java.util.Scanner;

public class LoopAdit {

	public static void main(String[] args) {
		int umur = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("MULAI");
		
		do {
			System.out.println("Masukkan Umur");
			umur = sc.nextInt();

		}while(umur<1 || umur>100);
		
		System.out.println("Umur anda adalah : "+umur);
	}
}