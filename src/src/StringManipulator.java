/**
 * 
 * @author jgonsalves21
 * StringManipulator
 *
 */
public class StringManipulator 
{

	public String noVowels(String a)
	{
		int strLength = a.length();
		String str = "";
		
		for (int letterNum = 0; letterNum < strLength; letterNum ++)
		{
			char charAt = a.charAt(letterNum);
			
			if (charAt == 'a' || charAt == 'e' || charAt == 'i' || charAt == 'o' || charAt == 'u' || charAt == 'A' || charAt == 'E' || charAt == 'I' || charAt == 'O' || charAt == 'U')
			{
				
				charAt = '*';
				str = str + charAt;
			}
			else
			{
				str = str + charAt;
			}		
		}
		
		return str;
		
		}
	
	public String reverse(String a)
	{
		
		int strLength = a.length();
		String str = "";
		
		for (int letterNum = 0; letterNum < strLength; letterNum ++)
		{
			char charAt = a.charAt(letterNum);
			str = charAt + str;
		}	
		
		return str;
		
	}
	
	
	
}
