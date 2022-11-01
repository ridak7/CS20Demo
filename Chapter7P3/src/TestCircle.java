
public class TestCircle 
{

	public static void main(String[] args) 
	{
		Circle circ = new Circle();	
		Circle circ2 = new Circle(2.7);
		
		System.out.println(circ.getRadius());
		System.out.println(circ.area());
		System.out.println(circ.circumference());
		
		System.out.println(circ.equals(circ2));
		
	}

}
