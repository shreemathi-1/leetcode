// Last updated: 6/29/2026, 8:02:26 PM
1class Solution {
2    public int numOfStrings(String[] patterns, String word) {
3        int c =0;
4        for(int i =0;i<patterns.length;i++)
5        {
6            if(word.indexOf(patterns[i]) != -1)
7            {
8                c++;
9            }
10        }
11        return c;
12    }
13}