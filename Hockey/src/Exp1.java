package src;
import java.util.Scanner;

public class Exp1 
{

	//Determine if a numeric entry is valid or not.
	public static boolean isValidNumber(int userNum, int minNum, int maxNum)
	{
		if(minNum <= userNum && userNum <= maxNum)
		{
			return(true);
		}
		else
		{
			return(false);
		}
	}
	
	
	
	public static String getLetterGrade(int numGrade)
	{
		if(numGrade < 60)
			return("D");
		
		else if(numGrade < 70)
		{
			if(numGrade == 69)
				return("C");
			else
				return("C-");
		}			
		
		else if(numGrade < 80)
		{
			if(numGrade == 79)
				return("B");
			else
				return("B-");
		}
		
		else if(numGrade < 90)
		{
			if(numGrade == 89)
				return("A");
			else
				return("A-");
		}
		
		else if(numGrade < 100)
				return("A+");
		
		else
			return ("A+");
			
	}
	
	
		
	public static void main(String[] args) 
	{
		final int minValue = 0;
		final int maxValue = 100;
		int numericGrade;
		String letterGrade;
		
		Scanner input = new Scanner(System.in);
		
		//Obtain user input 
		System.out.print("Enter a numeric grade (-1 to quit): ");
		numericGrade = input.nextInt();//get an integer from the user
		
		while(numericGrade != -1)
		{
			if(isValidNumber(numericGrade, minValue, maxValue))
			{
				//Calling function to return letter grade associated with numericGrade
				letterGrade = getLetterGrade(numericGrade);
				System.out.print("The grade " + numericGrade + " is a(n) "+ letterGrade + ".");
			}
			else
			{
				System.out.print("Grade entered is not valid. ");
			}
			
			//Obtain user input again before leaving the loop
			System.out.print("Enter a numeric grade (-1 to quit): ");
			numericGrade = input.nextInt();//get an integer from the user
		}
		
		

	}

}
