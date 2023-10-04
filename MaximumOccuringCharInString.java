package assignment;

import java.util.Scanner;



public class MaximumOccuringCharInString 
{
	public static void main(String[] args) 
	{
		int count=1;
		System.out.print("Enter the string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int arr[]=new int[127];
		for (int i = 0; i < str.length(); i++) 
		{
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
		}
		
		int max=-1;
		char c=' ';
		
		for (int i = 0; i < str.length(); i++)
		{
			if(max<arr[str.charAt(i)])
			{
				max=arr[str.charAt(i)];
				c=str.charAt(i);
			}
		}
		System.out.print("Maximum occuring character are:"+c);
	}
}
