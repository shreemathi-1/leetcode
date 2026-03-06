// Last updated: 3/6/2026, 7:06:48 AM
1class Solution 
2{
3    public String mergeAlternately(String word1, String word2) 
4    {
5        StringBuilder res = new StringBuilder();
6        int i , j;
7        for( i =0,j=0;i<word1.length();i++,j++)
8        {
9            res.append(word1.charAt(i));
10            if(j < word2.length())
11            {
12                res.append(word2.charAt(j));
13            }
14        }
15        if(j < word2.length())
16        res.append(word2.substring(j));
17        // res.append(i,word1.length+1);
18        return res.toString();
19    }
20}