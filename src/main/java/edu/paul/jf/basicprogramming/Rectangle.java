package edu.paul.jf.basicprogramming;

public class Rectangle {

	// define two fields
    private double length;
    private double width;
    
    // define no arg constructor
    Rectangle()
    {
        this.length = 1;
        this.width = 1;
    }
    // define parameterized constructor
    Rectangle(double length, double width)
    {
        this.length = length;
        this.width  = width;
    }
    
    void setSize(double l, double w) 
    {
    	length = l;
    	width   = w;
    }
    // define a method to return area
    double getSize()
    {
        return (length * width);
    }
    // define a method to return perimeter
    double getPerimeter()
    {
        return (2 * (length + width));
    }
}