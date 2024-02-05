package assignments;
import java.util.Arrays;
public class Anagram {
	
	public static boolean isAnagram(String str1,String str2)
	{
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		if(str1.length()==str2.length())
		{
			char[] ch1=str1.toCharArray();
			char[] ch2=str2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			
			for(int i=0;i<ch1.length;i++)
			{
				if(ch1[i]!=ch2[i])
				{
					return false;
				}
				return true;	
			}
			
		}
		return false;
		
	}
	
	public static void main(String[] args)
	{
		String s1="tamil";
		String s2="amilt";
		boolean ans=isAnagram(s1,s2);
		if(ans)
		{
			System.out.println(s1+" and "+s2+" is anagram");
		}
		else
		{
			System.out.println(s1+" and "+s2+" is not anagram");
		}
	}

}

