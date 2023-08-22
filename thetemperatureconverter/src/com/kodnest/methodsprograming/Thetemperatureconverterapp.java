package com.kodnest.methodsprograming;

import java.util.Scanner;

public class Thetemperatureconverterapp {

	
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter temperature in fahrenheit");
			double fahrenheit= scan.nextDouble();
			Thetemparetureconverter temperatureConverter = new Thetemparetureconverter();
			double celsius=temperatureConverter.convertFahrenheitToCelsius(fahrenheit);
			System.out.println("The temperature in celsius is " +celsius);

	}

}
