package SkillBuilding;

import java.util.Scanner;

public class OddSum 
{

	public static void main(String[] args) 
	{
		//Declare and initialize variables
		int max;
		int sum = 0;
		int step = 2;
		
		//Obtain a number from user
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the maximum value: ");
		max = input.nextInt();
		
		for(int i = 1; i <= max; i += step)
		{
			sum += i;
		}
		System.out.print("The sum of the odd numbers from 1 to " + max + " is: " + sum);
		
	}

}
