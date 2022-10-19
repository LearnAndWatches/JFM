package edu.paul.jf.looping;

public class LoopForEach {

	public static void main(String[] args) {
		int [] intArr = {1,2,3,4,5,6,7,8,9};
		String [] strArr = {"AA","BB","CC","DD"};
		
		
		//CASE FIRST
		for(int k : intArr)		{
			System.out.print(k+",");
		}
		System.out.println();
		for(int i=0;i<intArr.length;i++)
		{
			System.out.print(intArr[i]+",");
		}
		System.out.println();
		//CASE SECOND
		int intLoop =0;
		for(int k : intArr)
		{			
			if(k!=2) {
				System.out.print(k+",");				
			}
			intLoop++;
		}
		System.out.println();
		for(int i=0;i<intArr.length;i++)
		{
			if(i!=2)
			{
				System.out.print(intArr[i]+",");				
			}			
		}
	}
}