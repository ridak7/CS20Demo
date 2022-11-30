import java.util.ArrayList;
import java.util.Scanner;

public class HighestGrade 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		int grade, highNum;
		
		//Fill the Arraylist with five grades
		for(int i=0; i < 5; i++)
		{
			System.out.println("Enter a grade (between 0 and 100): ");
			grade = input.nextInt();
			numbers.add(grade);
			
		}
		
		//Determine the highest grade
		highNum = 0;
		
		for(Integer num: numbers)//special for loop for Arrays
		{
			grade = num;
			
			if(grade > highNum)
			{
				highNum = grade;
			}
		}
		System.out.println("The highest grade is: "+ highNum);
		
		
		
		
		
	}

}
