// Last updated: 2/13/2026, 3:17:05 PM
class Solution 
{
    public boolean isPalindrome(String s) 
    {
        String t = "";      
        s = s.toLowerCase();
        for(int i =0;i<s.length();i++)
        {
            if(Character.isLetterOrDigit(s.charAt(i) ) )
            {
                t += s.charAt(i);
            }
        }
        int n = t.length();
        int l =0,r = n -1;
            while(l < r)
            {
                if(t.charAt(l) != t.charAt(r) )
                {
                     return false;
                   
                }
                else
                {
                     l++;
                    r--;
                }
                
            }
  return true;
    }
}