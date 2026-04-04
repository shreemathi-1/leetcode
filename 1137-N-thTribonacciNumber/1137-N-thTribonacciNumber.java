// Last updated: 4/4/2026, 10:39:05 AM
1class Solution {
2    public int tribonacci(int n) {
3        int t1 = 0,t2 =1,t3 =1;
4        for(int i =1;i<=n;i++)
5        {
6            int temp = t1 +t2+t3;
7            t1 = t2;
8            t2 = t3;
9            t3 = temp;
10        }
11        return t1;
12    }
13}