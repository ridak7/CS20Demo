
public class Exp1 
{

	public static void main(String[] args) 
	{
		int randNum;
		int sequenceLength = 0;
		
		do
		{
			randNum = (int)(11*Math.random());
			System.out.println(randNum + " ");
			sequenceLength += 1;
			
			
		}while(randNum != 0);
		
		System.out.println("\n Length of sequence was "+ sequenceLength);

	}

}
