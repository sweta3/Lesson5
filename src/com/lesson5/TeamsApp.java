package com.lesson5;
import java.util.Scanner;
/*
Problem 3
        You have been asked to develop a java application
        to allow to enter the number of Students can hit in the group. The application
        should then calculate and display how many Students can be filled  in the Team and how
        many Students have left over.
        Your application should use instantiable classes to separate the calculations from the user input and output.
        TeamsApp.java
        -- takes input from the user
        -- uses the Teams -- the instantiable class to perform the actual computations
*/
public class TeamsApp {

	public static void main(String[] args) {
        // declare local variables
		int numStu;
		int tSize;
		int numTeams;
		int rem;
	
        //declare a variable called input and create an object of type Scanner
		Scanner sc = new Scanner(System.in);
		
        // declare a variable called myTeams to be able to work with an object of type Teams and create an object of type Teams
		Teams myTeams = new Teams();
		
        //input "Please enter the number of students: "
		System.out.println("Please enter the number of students: ");
		numStu=sc.nextInt();
        //input "Please enter the size of the groups: "
		System.out.println("Please enter the size of groups: ");
		tSize=sc.nextInt();
		
        //process
		myTeams.setNumOfStudents(numStu);
		myTeams.setTeamSize(tSize);
		
		myTeams.calculateMetrics();
		
		numTeams=myTeams.getNumOfTeams();
		rem=myTeams.getRemainigs();
        //output of getNumOfTeams, getRemmainigs
 System.out.println("The number of teams of "+tSize+" from a group of "+ numStu+" will be "+numTeams+" teams with "+rem+" left over");
    }
}