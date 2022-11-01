public class Circle   //OOP
{
	private double radius;
	
	
	public Circle()//Create the constructor method
	{
		radius = 1.2;
	}
	
	public Circle(double r)//Overloading the constructor method
	{
		radius = r;
	}
	
	public double getRadius()//Accessor Method returns radius
	{
		return radius;
	}
	public void setRadius(double r)//Mutator method sets the new radius
	{
		radius = r;
	}

	public double area()
	{
		double cArea;
		cArea = Math.PI * radius * radius;
		
		return cArea;
	}
	
	public double circumference()
	{
		double c;
		
		c = 2 * Math.PI * radius;
		
		return c;
	}
	
	public void displayAreaFormula()
	{
		System.out.println("The formula for the area of a circle is a = PI*r*r");
	}
	
	public boolean equals(Object c)
	{
		Circle tCirc = (Circle)c;
		
		if(tCirc.getRadius() == radius)
			return true;
		else
			return false;
		
	}
	
	public String toString()
	{
		String cSt;
		
		cSt = "Circle has radius "+ radius;
		
		return cSt;
	}
	
}