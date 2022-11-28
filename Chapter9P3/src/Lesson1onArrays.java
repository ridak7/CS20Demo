
public class Lesson1onArrays 
{

	public static void main(String[] args) 
	{
		//How do you declare an Array
		//String[] studentNames;
		
		//How do I initialize an Array
		//String[] studentName = new String[5];
		
		//To declare, allocate, and initialize all at once
		String[] studentNames = {"AA", "BB", "CC", "DD", "EE"};
		
		System.out.println(studentNames.length);
		
		System.out.println(studentNames[2]);
		
		studentNames[2] = "GG";
		
		System.out.println(studentNames[2]);

	}

}
