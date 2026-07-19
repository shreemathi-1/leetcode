// Last updated: 7/19/2026, 9:06:50 AM
1class Solution {
2    public int largestAltitude(int[] gain) {
3        int max = 0;
4           int sum =0;
5        for(int i =0;i<gain.length;i++)
6        {
7         
8                sum += gain[i];
9                max = Math.max(max,sum);
10            
11        }
12        return max;
13    }
14}