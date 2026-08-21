// Last updated: 8/21/2026, 12:30:17 PM
1class Solution 
2{
3    public int maxProfit(int[] prices) 
4    {
5        int minSoFar = Integer.MAX_VALUE;
6        int profit = 0;
7        for(int i =0;i<prices.length;i++)
8        {
9            minSoFar = Math.min(minSoFar,prices[i]);
10            profit = Math.max(profit,prices[i] - minSoFar);
11        }
12        return profit;
13    }
14}