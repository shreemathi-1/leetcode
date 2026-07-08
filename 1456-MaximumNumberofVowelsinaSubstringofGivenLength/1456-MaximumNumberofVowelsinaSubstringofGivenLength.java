// Last updated: 7/8/2026, 11:33:49 PM
1class Solution {
2    public boolean isVowel(char ch)
3    {
4        if(ch == 'a' || ch =='e' || ch =='i' || ch=='o' || ch =='u')
5        {
6            return true;
7        }
8        return false;
9    }
10    public int maxVowels(String s, int k) 
11    {
12        int left = 0, vowCount =0, maxCount=0;
13        for(int r =0;r<s.length();r++)
14        {
15            if( isVowel(s.charAt(r)))
16            {
17                vowCount++;
18            }
19            if(r - left + 1 == k)
20            {
21                maxCount = Math.max(maxCount, vowCount);
22                if(isVowel(s.charAt(left)))
23                {
24                    vowCount--;
25                }
26                left++;
27            }
28        }
29    return maxCount;
30    }
31}