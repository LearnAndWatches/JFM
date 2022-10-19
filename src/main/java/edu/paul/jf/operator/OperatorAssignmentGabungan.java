package edu.paul.jf.operator;

public class OperatorAssignmentGabungan {

	public static void main(String[] args) {
		int a = 10;
		int b = 10;
		int c = 10;
		int d = 10;
		int e = 10;
		int f = 10;
		
		System.out.println("Variabel a,b,c,d,e,f = 10 \n");
		a += 5;
		System.out.println("Hasil operasi a += 5 : "+a);
		b -= 3;
		System.out.println("Hasil operasi b -= 3 : "+b);
		c *= 3;
		System.out.println("Hasil operasi c *= 3 : "+c);
		d /= 3;
		System.out.println("Hasil operasi d /= 3 : "+d);
		e %= 3;
		System.out.println("Hasil operasi e %= 3 : "+e);
		f <<= 2;
		System.out.println("Hasil operasi f <<= 2 : "+f);
	}

}
