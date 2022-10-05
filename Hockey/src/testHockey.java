
public class testHockey 
{

	public static void main(String[] args) 
	{
		Puck yP = new Puck(4);
		Puck sP = new Puck(5.5);
		
		System.out.println(yP.getDivision());
		System.out.println("The youth puck has a weight: "+
											yP.getWeight() +
											"and thickness: "+
											yP.getThickness());
		
		if(yP.compareTo(sP) == 0)
		{
			System.out.println("The pucks have the same size");
		}
		else if(yP.compareTo(sP) == -1)
		{
			System.out.println("The youth puck is smaller");
		}
		else
		{
			System.out.println("The standard puck is larger");
		}
		

	}

}
