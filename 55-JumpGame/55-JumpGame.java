// Last updated: 2/23/2026, 12:26:13 PM
1class Solution 
2{
3    public boolean canJump(int[] nums) 
4    {
5        int maxReach = nums[0];
6      
7        if(nums.length ==0 || nums.length==1) return true;
8        for(int i =1;i<=maxReach;i++)
9        {
10                if( maxReach >= nums.length-1  )
11                {
12                    return true; 
13                }   
14                maxReach =Math.max(maxReach, nums[i] + i);       
15           
16        }
17        return false;
18    }
19}