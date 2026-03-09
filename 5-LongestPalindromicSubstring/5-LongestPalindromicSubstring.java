// Last updated: 3/9/2026, 4:24:15 PM
1class Solution 
2{
3    public String longestPalindrome(String s) 
4    {
5          StringBuilder sb = new StringBuilder();
6            for(char ch : s.toCharArray())
7            {
8                sb.append("#").append(ch);
9            }
10            sb.append("#");
11        int start =0;
12        int maxLen =0;
13        int center =0;
14        String hashStr= sb.toString();
15        int[] p = new int[hashStr.length()];
16        for(int i =0;i<hashStr.length();i++)
17        {
18            int left = i-1;
19            int right = i+1;
20            while(left>=0 && right <hashStr.length() && hashStr.charAt(left) == hashStr.charAt(right))
21            {
22                p[i]++;
23                left--;
24                right++;
25            }
26            if(p[i] > maxLen)
27            {
28                maxLen = p[i];
29                center = i;
30            }
31            start = (center- maxLen)/2;
32        }
33        return s.substring(start,start+maxLen);
34    }
35}