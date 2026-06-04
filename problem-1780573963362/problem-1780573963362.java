// Last updated: 6/4/2026, 5:22:43 PM
1class Solution {
2    public boolean isVowel(char ch)
3    {
4        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
5        {
6            return true;
7        }
8        return false;
9    }
10    public int maxVowels(String s, int k) {
11        int ws =0,max =0,c=0;
12        for(int i =0;i<s.length();i++)
13        {
14            if(isVowel(s.charAt(i) ))
15            {
16                c++;
17            }
18            if(i >= k)
19            {
20                if(isVowel(s.charAt(ws)))
21                {
22                    c--;                  
23                }
24                 ws++;
25            }
26            max = Math.max(max , c);
27        }
28        return max;
29    }
30}