import java.util.Scanner;

public class Lesson2 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		String name;
		
		char[] nameLetter;
		
		//prompt the user for a name
		System.out.println("Enter your name: ");
		name = input.nextLine();
		
		//Display the name backwards
		nameLetter = name.toCharArray();
		
		//Traverse the nameLetter array
		for(int letter = nameLetter.length; letter > 0; letter--)
		{
			System.out.print(nameLetter[letter - 1]);
		}
		
	}

}
