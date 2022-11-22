
public class Lesson1 {

	public static void main(String[] args) 
	{
		//Declare an Array
		//String[] studentNames;
		
		//Initialize the Array
		//studentNames = new String[5];
		
		//Declare, allocate, and initialize at the same time
		String[] studentNames = {"Li", "Ali", "Krista", "Taimoor", "Kevin"};
		
		//System.out.println(studentNames[2]);
		//System.out.println(studentNames[4]);
		
		//studentNames[2] = "Haydu";
		//System.out.println(studentNames[2]);
		
		//System.out.println(studentNames.length);
		
		/*for(int i=0; i < studentNames.length; i++)
		{
			System.out.println(studentNames[i]);
		}
		*/
		
		for(String element: studentNames)
		{
			System.out.println(element);
		}
		
		

	}

}
