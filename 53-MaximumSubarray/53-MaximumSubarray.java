// Last updated: 2/13/2026, 3:17:28 PM
class Solution 
{
    public int maxSubArray(int[] nums) 
    {
        int n = nums.length;
        if(n==0 )return 0;
        if(n==1) return nums[0];
        int maxSum =nums[0], curSum =nums[0];
        for(int i=1;i<n;i++)
        {
            curSum = Math.max(nums[i], curSum + nums[i]);
            maxSum = Math.max(curSum,maxSum);
        }
        return maxSum;
    }
}