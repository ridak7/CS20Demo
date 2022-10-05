package SkillBuilding;

import java.util.Scanner;

public class NumbersSum 
{	

	public static void main(String[] args) 
	{
		//Declaring all the variables
		int num = 1;
		int numMax;
		int numSum = 0;
		Scanner input = new Scanner(System.in);
		
		//Obtain a number from the user
		System.out.print("Enter a number greater than 0: ");
		numMax = input.nextInt();//record number from user
		
		while( num <= numMax)//check if num is less than equal to numMax
		{
			System.out.println(num);
			numSum += num;//numSum update to plus num
			num +=1;//num increase by 1
		}
		//output the series of numbers upto numMax
		System.out.println("The sum of the numbers is "+ numSum);
		
	}

}
