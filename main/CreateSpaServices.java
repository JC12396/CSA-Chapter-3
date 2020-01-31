package main;

import java.util.Scanner;

public class CreateSpaServices 
{

	public static void main(String[] args) 
	{
		String getString = null;
		String Service;
		double price;
		
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();
		Scanner input = new Scanner(System.in);
		
		input.nextLine();
		pl("Enter service >>");
		Service = input.nextLine();
		pl("Enter price >>");
		price = input.nextDouble();
		
		secondService.setServiceDescription(Service);
		firstService.setPrice(price);
		
		pl("First service details:");
		pl(firstService.getServiceDescription() + " $" + firstService.getPrice());
		pl("Second service details:");
		pl(secondService.getServiceDescription() + " $" + secondService.getPrice());
		
	}
	public static void pl(String getString)
	{
		System.out.println(getString);
	}

}
