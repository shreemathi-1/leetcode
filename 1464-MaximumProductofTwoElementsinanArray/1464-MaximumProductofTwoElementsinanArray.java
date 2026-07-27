// Last updated: 7/27/2026, 8:47:27 PM
1class Solution 
2{
3    public int maxProduct(int[] nums) 
4    {
5        int max = Integer.MIN_VALUE , secMax = Integer.MIN_VALUE ;
6        int maxProd = 0 ; 
7        for(int i =0;i<nums.length;i++)
8        {
9            if(nums[i] > max)
10            {
11                secMax = max;
12                max = nums[i];
13            }
14            else if(nums[i] > secMax )
15            {
16                secMax = nums[i];
17            }
18        }
19        maxProd = (max-1)*(secMax-1);
20        return maxProd;
21    }
22}