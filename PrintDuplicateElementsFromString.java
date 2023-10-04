package assignment;

public class PrintDuplicateElementsFromString
{
	public static void main(String[] args)
	{
		String s = "saannaaklp";
        String s2 = "";
        String Duplicate="";
        for (int i = 0; i < s.length(); i++) 
        {
            Boolean found = false;
            for (int j = 0; j < s2.length(); j++)
            {
                if (s.charAt(i) == s2.charAt(j))
                {
                    found = true;
                    Duplicate = Duplicate.concat(String.valueOf(s.charAt(i)));
                    break; //don't need to iterate further
                }
            }
            if (found == false)
            {
                s2 = s2.concat(String.valueOf(s.charAt(i)));
            }
        }
        System.out.println("Duplicate elements are:"+Duplicate);
      
    }
	
}
