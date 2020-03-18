package com.lesson5;
/*
You have been asked to develop a java application
to allow to calculate length and width of the shape of the area.
Area.java is the instantiable class to perform the actual computations
*/
public class Area {
	//declare data variables
	private double length;
	private double width;
	private double area;
	
	//constructor
	public Area() {
		
	}
	public Area (double legth, double width) {
		this.length=length;
		this.width=width;
	}
	
	//set methods length and width
	public void setLength(double length) {
		this.length=length;
	}
	public void setWidth(double width) {
		this.width=width;
	}
	
   //compute method
	public void calculateMetrics() {
		area=length*width;
	}
	
	//get area method
	public double getArea() {
		return area;
		
	}


}

