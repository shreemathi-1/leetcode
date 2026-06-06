// Last updated: 6/6/2026, 8:27:25 PM
1class Solution {
2    public boolean isVowel(char ch)
3    {
4        if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' )
5        {
6            return true;
7        }
8        return false;
9    }
10    public int maxVowels(String s, int k) 
11    {
12        int vow = 0,maxCount=0;
13        for(int i =0;i<s.length() ;i++)
14        {
15            if(isVowel(s.charAt(i)))
16            {
17                vow++ ;
18            }
19            if(i >=k)
20            {
21                if(isVowel(s.charAt(i-k)))
22                {
23                    vow--;
24                }
25            }
26            maxCount = Math.max(vow,maxCount);
27        }
28        return maxCount;
29    }
30}