import java.util.Scanner;

public class Lesson2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String name;
		char[] nameLetters;//Declare 1D Array
		
		//Prompt user for name
		System.out.println("Enter your name: ");
		name = input.nextLine();
		
		//Display name backwards
		nameLetters = name.toCharArray();
		
		//Traverse the nameLetters Array
		for(int letter = nameLetters.length; letter > 0; letter--)
		{
			System.out.print(nameLetters[letter - 1]);
		}
		System.out.println();
		
		

	}

}
