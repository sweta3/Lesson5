package com.lesson5;
import java.util.*;
/*
You have been asked to develop a java application
to allow to calculate length and width of the shape of the area.
AreaApp.java is the app runner. Please reuse the instantiable class to perform the actual computations
*/
public class AreaApp {

	public static void main(String[] args) {
		//declare variables
		double length;
		double width;
		double area;
		
		//declare and create objects
		Scanner sc = new Scanner(System.in);
		Area myArea = new Area();
	
		//input
		System.out.println("Please enter length: " );
		length=sc.nextDouble();
		System.out.println("Please enter width: " );
		width=sc.nextDouble();
			
		//process
		myArea.setLength(length);
		myArea.setWidth(width);
		
		myArea.calculateMetrics();
		
		//output
		area=myArea.getArea();
		System.out.print("A shape with a length of "+ length +"\n\tand width of "+width+" has an area of "+ area);
	
	}

}
