import java.util.Scanner;

public class Lesson3 
{

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int[] digits = new int[10];//counts digits 0 - 9
		
		int num, newDigit;
		
		//prompt the user for a number
		System.out.println("Enter a number: ");
		num = input.nextInt();
		
		//count the digits
		while(num > 0)
		{
			newDigit = num % 10;
			digits[newDigit] = digits[newDigit] + 1;//count digit
			num = num / 10;
		}
		
		//Display counts
		for(int i =0; i < 10; i++)
		{
			System.out.println(i + ":" + digits[i]);
		}
		
	}

}
