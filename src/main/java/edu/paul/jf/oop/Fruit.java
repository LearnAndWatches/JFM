package edu.paul.jf.oop;

public class Fruit {

	int grams;
	int calsPerGram;

	int total_calories() {
		return(grams*calsPerGram);
	}
}