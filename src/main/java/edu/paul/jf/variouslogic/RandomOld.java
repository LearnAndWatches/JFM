package edu.paul.jf.variouslogic;

public class RandomOld {

	public static void main(String[] args) {
		//Generate random number
		double rand = Math.random();

		//Output is different everytime this code is executed
		System.out.println("Random Number :" + rand);

		int max = 10;
		int min = 1;
		int range = max - min + 1;

		//generate random numbers within 1 to 10
		for(int i=0;i<10;i++)
		{
			int randInt = (int)(Math.random() * range) + min;
			
			//Output is different everytime this code is executed
			System.out.println(randInt);
		}
	}
}