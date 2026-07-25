// Last updated: 7/25/2026, 6:09:47 PM
1class Solution {
2    public int maxProduct(int n) {
3        int max = 0;
4        int secMax = 0;
5        while(n != 0)
6        {
7            int rem = n%10;
8            if(rem > max )
9            {
10                secMax = max;
11                max = rem;
12            }
13            else if(rem >secMax && rem != secMax )
14            {
15                secMax = rem;
16            }
17            n /= 10;
18        }
19        return max * secMax;
20    }
21}