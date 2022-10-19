package edu.paul.jf.looping;

public class LoopCase {
	
	public static void main(String[] args) {
		int intCaseOne = 10;
		int intBoundary=0;
		
		System.out.println("==========CASE 1==========");
		for(int i=intCaseOne;i>0;i--)
		{			
			if(i%2!=0)
			{
				for(int j=i;j>0;j--)
				{
					if(j%2!=0)
					{						
						System.out.print(j+" ,");
						intBoundary++;
					}
				}
				System.out.println();
			}
			
		}
		System.out.println();
		System.out.println("==========CASE 2==========");
		intCaseOne = 5;
		intBoundary=0;
		
		for(int i=intCaseOne;i>0;i--)
		{
			if(i%2!=0 && intBoundary!=0)
			{
				for(int j=i;j>0;j--)
				{
					if(j%2!=0)
					{						
						System.out.print(j+" ,");
						intBoundary++;
					}
				}
				System.out.println();
			}else
			{
				intBoundary++;
			}
			
		}		
	}
}