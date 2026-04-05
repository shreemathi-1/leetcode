// Last updated: 4/5/2026, 8:59:28 AM
1class Solution 
2{
3    public int mirrorFrequency(String s) 
4    {
5        int[] letterFreq = new int[26];
6        int[] digitFreq = new int[10];
7
8        for (char ch : s.toCharArray()) 
9        {
10            if (ch >= 'a' && ch <= 'z') 
11            {
12                letterFreq[ch - 'a']++;
13            } 
14            else if (ch >= '0' && ch <= '9') 
15            {
16                digitFreq[ch - '0']++;
17            }
18        }
19
20        int sum = 0;
21        for (int i = 0; i < 13; i++) {
22            sum += Math.abs(letterFreq[i] - letterFreq[25 - i]);
23        }
24
25        for (int i = 0; i < 5; i++) {
26            sum += Math.abs(digitFreq[i] - digitFreq[9 - i]);
27        }
28
29        return sum;
30    }
31}