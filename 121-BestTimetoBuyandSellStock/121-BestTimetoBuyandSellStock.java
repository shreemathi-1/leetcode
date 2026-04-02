// Last updated: 4/2/2026, 2:18:11 PM
1class Solution 
2{
3    public int maxProfit(int[] prices) 
4    {
5        int maxProf= 0;
6        int curProf = 0;
7        int minSoFar=Integer.MAX_VALUE;
8        for(int i =0;i<prices.length;i++)
9        {
10            if(prices[i] < minSoFar )
11            {
12                minSoFar = prices[i];
13            }
14            curProf = Math.max(prices[i] - minSoFar , curProf);
15            maxProf = Math.max(curProf,maxProf);
16        }
17        return maxProf;
18    }
19}