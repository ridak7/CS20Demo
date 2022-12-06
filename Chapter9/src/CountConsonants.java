import java.util.Scanner;

public class CountConsonants 
{

	public static void main(String[] args) 
	{
		//Determine the number of consonants in a word 
		
		Scanner input = new Scanner(System.in);
		
		String text;
		int numConsonants = 0;
		
		//Declare an Array of characters
		char[] textLetters;
		
		//Prompt the user for the text
		System.out.println("Enter text: ");
		text = input.nextLine();
		
		//make the text string to all lowercase
		text = text.toLowerCase();
		
		//Convert the text to an Array of characters
		textLetters = text.toCharArray();
		
		//Count the consonants
		for(int i= 0; i < textLetters.length; i++)
		{
			if(textLetters[i] != 'a' && textLetters[i] != 'e'
					&& textLetters[i] != 'i' && textLetters[i] != 'o'
					&& textLetters[i] != 'u' && textLetters[i] >= 'a' &&
					textLetters[i] <= 'z')
			{
				numConsonants += 1;
			}
		}
		//Report back to the user 
		System.out.println("The number of consonants in " + text + "is " + numConsonants);

	}

}
