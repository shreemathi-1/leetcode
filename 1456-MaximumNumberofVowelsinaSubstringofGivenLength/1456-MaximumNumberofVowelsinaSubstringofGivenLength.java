// Last updated: 3/9/2026, 12:17:59 PM
1class Solution 
2{
3    static boolean isVowel(char ch)
4 {
5     if(ch =='a'|| ch =='e'|| ch =='i'|| ch =='o'|| ch =='u')
6        return true;
7     return false;
8 }
9    public int maxVowels(String s, int k) 
10    {
11        
12   
13        int max =0;
14        int vow =0;
15        for(int i =0;i<s.length();i++)
16        {
17            if(isVowel(s.charAt(i)))
18            {
19                vow++;
20               
21            }
22            if(i>=k)
23            {
24                char ch = s.charAt(i-k);
25                if(isVowel(ch))
26                {
27                    vow--;
28                }
29            }
30            
31             max = Math.max(max,vow);
32            
33        }
34        return max;
35    }
36}