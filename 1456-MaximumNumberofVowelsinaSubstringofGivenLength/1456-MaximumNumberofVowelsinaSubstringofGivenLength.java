// Last updated: 6/4/2026, 9:42:57 PM
1class Solution {
2    public boolean isVowel(char ch)
3    {
4        if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' )
5        {
6            return true;
7        }
8        return false;
9    }
10    public int maxVowels(String s, int k) {
11        int vow =0,max =0;
12        for(int i =0;i<s.length();i++)
13        {
14            if(isVowel(s.charAt(i)))
15            {
16                vow++;
17            }
18            if(i >=k)
19            {
20                if(isVowel(s.charAt(i-k)))
21                {
22                    vow-- ;
23                }
24            }
25            max = Math.max(max,vow);
26
27        }
28        
29        return max;
30    }
31}