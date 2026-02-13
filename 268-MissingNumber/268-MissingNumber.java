// Last updated: 2/13/2026, 3:16:21 PM
class Solution {
    public int missingNumber(int[] nums)
     {
        int n = nums.length;
        int tot = n*(n+1)/2;
        int sum =0;
        for(int i =0;i<n;i++)
        {
            sum += nums[i];
        }
        return tot -sum;
    }
}