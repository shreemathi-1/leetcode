// Last updated: 2/17/2026, 7:20:46 PM
1class Solution 
2{
3    public boolean isPalindrome(String s)
4     {
5        StringBuilder sb = new StringBuilder();
6        s = s.toLowerCase() ;
7        for(int i = 0;i < s.length();i++ )
8        {
9            if(Character.isLetterOrDigit(s.charAt(i)) )
10            {
11                sb.append(s.charAt(i) );
12            }
13        }
14       
15        if(sb.toString().equals( sb.reverse().toString()) )
16        {
17            return true;
18        }
19        return false;
20    }
21}