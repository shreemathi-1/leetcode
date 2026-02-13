// Last updated: 2/13/2026, 3:15:48 PM
class Solution 
{
    public double findMaxAverage(int[] nums, int k) 
    {
        int n = nums.length;
        double sum = 0;
        
        for(int i =0;i<k;i++)
        {
            sum += nums[i];
        }
        double maxSum = sum;
        for(int i =k;i<n;i++)
        {
            sum += nums[i];
            sum -= nums[i-k];
             maxSum = Math.max(sum,maxSum);
        }
        return (double)maxSum / k;
    }
}