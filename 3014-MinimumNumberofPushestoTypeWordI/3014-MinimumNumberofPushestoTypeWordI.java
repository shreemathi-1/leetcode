// Last updated: 7/30/2026, 9:26:49 PM
1class Solution {
2    public int minimumPushes(String word) {
3        int pushes = 0;
4        for(int i =0;i<word.length();i++)
5        {
6            pushes += (i / 8) + 1;
7        }
8        return pushes;
9    }
10}