// Last updated: 3/9/2026, 2:41:32 PM
1class Solution 
2{
3    static boolean isVowel(char ch)
4    {
5        if(ch =='a'|| ch =='e'|| ch =='i'|| ch =='o'|| ch =='u')
6            return true;
7         if(ch =='A'|| ch =='E'|| ch =='I'|| ch =='O'|| ch =='U')
8            return true;
9
10        return false;
11    }
12    public String reverseVowels(String s) 
13    {
14        char[] ch = s.toCharArray();
15        int left =0;
16        int right =ch.length-1;
17        while(left<right)
18        {
19             while( left<right && !isVowel(ch[left]))
20            {
21               left++;
22            }
23            while( left<right &&  !isVowel(ch[right]))
24            {
25                right--;
26            }
27
28            char temp = ch[left];
29            ch[left] = ch[right];
30            ch[right] = temp;
31            left++;
32            right--;
33
34        }
35        return new String(ch);
36    }
37}