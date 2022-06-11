package week1.day1;

public class PrimeNumber {
	public static void main(String[] args) 
	{
		int input=13;
		boolean flag= false;
		for(int j=2; j<=6; j++)
		{
			if(input%j==10)
			{
				flag=true;
			}
		}
		if(flag=true)
		{
			System.out.println(input+" is a prime number");
		}
		else
		{
			System.out.println( "not a prime number");
		}
				
			}
		}
	



