package edu.paul.jf.looping;

public class LoopFor {

	public static void main(String[] args) {
//		for(int i=0;i<5;i++)
//		{
//			System.out.print(i);
//		}
		
		//NESTED FOR
		int intLoop =0;
		for (int i = 0; i < 2; i++ ) {
			for (int j = 0; j < 3; j++ ){
//				intLoop++;				
				if(j==0)
				{
					System.out.println(i+" SUKSES ke - "+j);
					break;
				}
				for(int k =0 ;k<4;k++)
				{
					System.out.println("BREAK K DIEKSEKUSI"); 
					
					System.out.println("OK"+k);
					for(int l=0;l<7;k++)
					{
						System.out.println("BREAK L DIEKSEKUSI");
					}
				}
			}
		}		
		System.out.println("BREAK DIEKSEKUSI");
	}
}
//0 SUKSES ke - 5
//1 SUKSES ke - 5
//2 SUKSES ke - 5
//3 SUKSES ke - 5
//4 SUKSES ke - 5
//5 SUKSES ke - 5