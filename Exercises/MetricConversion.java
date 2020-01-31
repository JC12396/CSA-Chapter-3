package Exercises;

import java.util.Scanner;

import FtoC.GetStuff;

public class MetricConversion 
{

	public static void main(String[] args) 
	{
		double convertC;
		double convertL;
		double centimeterEntry;
		double literEntry;
		
		GetMeasures centimetersNum1 = new GetMeasures();
		GetMeasures inchesNum1 = new GetMeasures();
		GetMeasures litersNum1 = new GetMeasures();
		GetMeasures gallonsNum1 = new GetMeasures();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter a length in centimeters >>> ");
		centimeterEntry = input.nextDouble();
		System.out.println("Now, please enter the amount of liquid in liters >>> ");
		literEntry = input.nextDouble();
		
		convertC = convertC(centimeterEntry);
		centimetersNum1.setCent(centimeterEntry);
		inchesNum1.setInch(convertC);
		
		convertL = convertL(literEntry);
		litersNum1.setLiter(literEntry);
		gallonsNum1.setGallons(convertL);
		
		System.out.println(centimetersNum1.getCentLength() + " length in CM");
		System.out.println(convertC + " length in Inches");
		System.out.println(litersNum1.getLiterAmount() + " amount in Liter/s");
		System.out.println(convertL + " amount in Gallon/s");

		
		

	}
	public static double convertC(double c)
	{
		double convertC;
		convertC = c/2.54;
		return convertC;
	}
	public static double convertL(double l)
	{
		double convertL;
		convertL = l/3.7854;
		return convertL;
	}

}
