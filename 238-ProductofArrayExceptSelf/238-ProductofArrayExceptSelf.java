// Last updated: 4/9/2026, 8:46:07 PM
1class Solution 
2{
3    public int[] productExceptSelf(int[] nums) 
4    {
5        int[] ans = new int[nums.length];
6        int temp1 = 1;
7        for(int i =0;i<nums.length;i++)
8        {
9            ans[i] = temp1;
10            temp1 *= nums[i];
11        }
12        int temp2 =1;
13        for(int i = nums.length-1;i>=0;i--)
14        {
15            ans[i] *=temp2;
16            temp2 *= nums[i] ;
17        }
18        return ans;
19    }
20}