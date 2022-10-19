package edu.paul.jf.branchinglogic;

public class TernaryOperator {

	public static void main(String[] args) {
		//OPERATOR TERNARY
		int nilai = 55;
		String strCompare = "Kemarau";
//		String output = (strCompare.equals("Kmarau")) ? 
//				"Selamat anda lulus":
//					"Anda Tidak Lulus";
//		String output = (strCompare.equals("kemarau")) ;
		String output = ((((strCompare.equals("Kemarau")) ? "1":"0").equals("1")?"H":"J").
				equals("H")?"K":"M").equals("M")?"0":"1";
		System.out.print(output);
//		if(strCompare.equals("Kemarau"))
//		{
//			output = "Selamat anda lulus";
//		}
//		else
//		{
//			output = "Anda Tidak Lulus";
//		}
	}
}