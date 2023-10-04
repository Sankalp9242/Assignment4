package assignment;

public class PalindromOrNot 
{
	public static void main(String[] args)
	{
		String number1="2552";
		String number2="";
		for (int i =number1.length()-1; i>=0; i--)
		{
			number2=number2.concat(String.valueOf(number1.charAt(i)));
		}
		if(number1.equalsIgnoreCase(number2))
		{
			System.out.println("pallindrom");
		}
		else
		{
			System.out.println("Not a pallindrom");
			
		}
	}
}
