package edu.paul.jf.method;

public class MethodFormats {

	public static void main(String[] args) {		
	}
//	YANG SALAH !!
//	public float convertCelsius(float tempC) {
//		return( ((tempC * 9.0f) / 5.0f) + 32.0 );
//	}
	/*
	 * Di Java, statement adalah instruksi yang dapat dieksekusi yang memberi tahu kompiler apa yang harus dilakukan.
	 * Ini membentuk perintah lengkap untuk dieksekusi dan dapat mencakup satu atau lebih ekspresi. 
	 * Sebuah kalimat membentuk ide lengkap yang dapat mencakup satu atau lebih klausa.
	 */
	public float convertCelsius(float tempC) {
		return( ((tempC * 9f) / 5f) + 32 );
	}
}