package FtoC;

import java.util.Scanner;

public class Temp 
{
	public static void main(String[] args)
	{
		double convertF;
		double convertC;
		
		double celsiusEntry;
		GetStuff celsiusNum1 = new GetStuff();
		GetStuff fahrenheitNum1 = new GetStuff();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a temperature in celsius >>> ");
		celsiusEntry = input.nextDouble();
		
		convertF = convertFahrenheit(celsiusEntry);
		celsiusNum1.setCelsius(celsiusEntry);
		fahrenheitNum1.setF(convertF);
		System.out.println("The temperature in fahrenheit is " + convertF);
	
		System.out.println(celsiusNum1.getCelsiusTemp() + " degrees in C");
		System.out.println(fahrenheitNum1.getFTemp() + " degrees in F");
	
	}
	public static double convertFahrenheit(double c)
	{
		double convertF;
		convertF = (c * 9/5) + 32;
		return convertF;
	}

}
