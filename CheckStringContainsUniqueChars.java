package assignment;

import java.util.Scanner;


public class CheckStringContainsUniqueChars
{
	public static void main(String[] args)
	{
		boolean unique=true;
		System.out.print("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		for (int i = 0; i < str.length(); i++) 
		{
			for (int j =i+1; j<str.length(); j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					unique=false;
				}
			}
		}
		if(unique)
		{
			System.out.println("string characters are unique");
		}
		else 
		{
				System.out.println("String characters are not unique");
			
		}
	}
}
