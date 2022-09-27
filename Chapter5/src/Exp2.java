import java.text.NumberFormat;
import java.util.Scanner;

public class Exp2 
{

	public static void main(String[] args) 
	{
		int flip;
		int choice;
		int correctGuess = 0;
		int numGuesses = 0;
		
		Scanner userinput = new Scanner(System.in);
		NumberFormat percent = NumberFormat.getPercentInstance();
		
		System.out.println("Enter 0 for heads or 1 for tails (-1 to quit): ");
		choice = userinput.nextInt();
		
		while(choice != -1)
		{
			flip = (int)(Math.random()* 0.5);
			numGuesses = numGuesses + 1;
			
			if(choice == flip)
			{
				correctGuess = correctGuess + 1;
			}
			else
			{
				System.out.println("Incorrect!");
			}
			
			System.out.println("Enter 0 for heads or 1 for tails (-1 to quit): ");
			choice = userinput.nextInt();
		}//ends the while loop

	System.out.println("\nThe percentage of correct guesses is " + 
							percent.format((double)correctGuess/(double)numGuesses));
	}//ends the main method

	
	
}//ends the class


