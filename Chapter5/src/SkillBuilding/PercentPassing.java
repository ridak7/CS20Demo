package SkillBuilding;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class PercentPassing 
{

	public static void main(String[] args) 
	{
		//Declaring variables to be used later
		final int SENTINEL = 0;
		int score = 0;
		int numScores = 0;
		int numPassing = 0;
		double percentPassing = 0;
		
		//Obtain a number from the user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a score (" + SENTINEL + " to QUIT): ");
		score = input.nextInt();
		
		//Taking care of decimal numbers
		NumberFormat dp = NumberFormat.getPercentInstance();
		//DecimalFormat dp = new DecimalFormat("0.00");
		
		
		while(score != SENTINEL)
		{
			numScores += 1;
			
			if(score > 70)
			{
				numPassing += 1;
			}
			System.out.print("Enter a score (" + SENTINEL + " to QUIT): ");
			score = input.nextInt();
		}//End of loop
		
		//Calculate the percentage of scores above 70%
		percentPassing = ((double)numPassing / (double)numScores);
		System.out.println("The percentage of scores above 70% is: "+
															dp.format(percentPassing));
		
		
	}

}
