// Last updated: 5/27/2026, 7:20:48 AM
1class Solution {
2    public void rotate(int[] nums, int k) {
3        int n = nums.length;
4        k = k % n;
5        rev(nums,0,n-1);
6        rev(nums,0,k-1);
7        rev(nums,k,n-1);
8    }
9    public void rev(int[] nums,int s , int e)
10    {
11        while(s<e)
12        {
13            int temp = nums[s];
14            nums[s] = nums[e];
15            nums[e] = temp;
16            s++;
17            e--;
18        }
19    }
20}