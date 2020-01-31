package Exercises;

public class GetMeasures {
	private double centLength;
	private double literVolume;
	private double inchLength;
	private double gallonAmount;
	
	public void setCent(double centimeter)
	{
		centLength = centimeter;
	}
	public double getCentLength()
	{
		return centLength;
	}
	public void setLiter(double liter)
	{
		literVolume = liter;
	}
	public double getLiterAmount()
	{
		return literVolume;
	}
	public void setInch(double inches)
	{
		inchLength = inches;
	}
	public double getInchLength()
	{
		return inchLength;
	}
	public void setGallons(double gallons)
	{
		gallonAmount = gallons;
	}
	public double getGallonAmount()
	{
		return gallonAmount;
	}
}
