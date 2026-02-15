// Last updated: 2/15/2026, 12:32:27 PM
1class Solution 
2{
3    public int[] productExceptSelf(int[] nums)
4     {
5        int n = nums.length;
6        int[] res = new int[n];
7        int temp=1;
8        for(int i =0;i<n;i++)
9        {
10            res[i] = temp;
11            temp *= nums[i];
12        }
13        temp = 1;
14        for(int i =n-1;i>=0;i--)
15        {
16            res[i] = res[i]*temp;
17            temp *= nums[i];
18        }
19        return res;
20    }
21}