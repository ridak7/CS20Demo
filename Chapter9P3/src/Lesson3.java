import java.util.Scanner;

public class Lesson3 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int[] digits = new int[10];//count digits 0 through 9
		
		int num, newDigit;
		
		//Prompt the user for a number
		
		System.out.println("Enter your a number: ");
		num = input.nextInt();
		
		//Count the digits
		while(num > 0)
		{
			newDigit = num % 10;
			
			digits[newDigit] += 1;
			
			num = num / 10;
			
		}
		
		//Display the counts
		for(int i = 0; i < 10; i++)
		{
			System.out.println(i + ":" + digits[i]);
		}
		
		
		
        
	}

}
