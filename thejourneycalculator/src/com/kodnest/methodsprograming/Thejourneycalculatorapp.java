package com.kodnest.methodsprograming;

import java.util.Scanner;

public class Thejourneycalculatorapp {

	public static void main(String[] args) {
		
			Scanner scan= new Scanner(System.in);
			System.out.println("Enter the speed and time to be calculated");
			double speed=scan.nextDouble();
			double time=scan.nextDouble();
			Thejourneycalculator journeyCalculator= new Thejourneycalculator();
			System.out.println(journeyCalculator.calculateDistance (speed, time));


	}

}
