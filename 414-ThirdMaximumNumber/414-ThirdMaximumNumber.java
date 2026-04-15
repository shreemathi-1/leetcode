// Last updated: 4/15/2026, 8:47:02 PM
1class Solution 
2{
3    public boolean isPalindrome(String s) 
4    {
5        s = s.toLowerCase();
6        StringBuilder sb = new StringBuilder();
7       for(int i =0;i<s.length();i++)
8       {
9         if(s.charAt(i) >= 'a' && s.charAt(i) <='z')
10         {
11            sb.append(s.charAt(i));
12         }
13         if(s.charAt(i) >='0' && s.charAt(i) <= '9')
14         {
15            sb.append(s.charAt(i));
16         }
17       }
18       String res = sb.toString();
19        System.out.println(res);
20        int l =0,r =res.length()-1;
21        while(l<r)
22        {
23           if(res.charAt(l) != res.charAt(r))
24           {
25            return false;
26           } 
27           l++;
28           r--;
29        }
30        return true;
31    }
32}