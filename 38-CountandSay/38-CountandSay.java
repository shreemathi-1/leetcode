// Last updated: 4/24/2026, 7:34:40 PM
class Solution {
    public String reverseWords(String s) {
        String[] splitStr = s.split("\\s+");
		String[] newStr = new String[splitStr.length];
		
		for(int i=0; i<splitStr.length; i++)
		{
			newStr[i]=reversed(splitStr[i]);
		}
		
		StringBuilder newbldr = new StringBuilder();
		
		for(int j=0; j<newStr.length; j++)
		{
			newbldr.append(newStr[j]);
			if(j!=newStr.length-1)
				newbldr.append(" ");
		}
		
		return newbldr.toString();
    }
    public String reversed(String sn)
	{
		StringBuilder sbr = new StringBuilder();
		
		for(int i=sn.length()-1; i>=0; i--)
		{
			sbr.append(sn.charAt(i));
		}
		return sbr.toString();
	}
}