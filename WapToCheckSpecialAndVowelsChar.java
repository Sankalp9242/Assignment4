package assignment;

import java.util.Scanner;

public class WapToCheckSpecialAndVowelsChar 
{
	public static void main(String[] args) 
	{
		String str;
		int special,vowels,consonants,i,l,digits;
		special=vowels=consonants=i=digits=0;
		System.out.println("--Count total number of special char vowels and consonants in the string--");
		System.out.println("Enter the string in lower case only");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		l=str.length();
		while(i<l)
		{
			if(((str.charAt(i)>='a')&&(str.charAt(i)<='z'))||((str.charAt(i)>='A')&&(str.charAt(i)>='Z')))
			{
					if((str.charAt(i)=='a')||(str.charAt(i)=='e')||
							(str.charAt(i)=='i') 
							||(str.charAt(i)=='o')
							||(str.charAt(i)=='u'))
					{
						vowels++;
					}
					else 
					{
						consonants++;
					}
			}
			else if (str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				digits++;
			}
			else
			{
				special++;
			}
			i++;
		}
		System.out.println("consonants:"+consonants);
		System.out.println("special:"+special);
		System.out.println("vowels:"+vowels);
		System.out.println("digits:"+digits);	
	}
}
