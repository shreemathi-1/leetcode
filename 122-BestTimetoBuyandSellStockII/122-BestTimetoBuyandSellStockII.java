// Last updated: 2/19/2026, 9:13:49 PM
1class Solution 
2{
3    public int maxProfit(int[] prices)
4     {
5        int maxProf = 0;
6        for(int i =1;i<prices.length;i++)
7        {
8            if(prices[i-1] < prices[i])
9            {
10                maxProf += prices[i] - prices[i-1];
11            }
12        }
13        return maxProf;
14    }
15}