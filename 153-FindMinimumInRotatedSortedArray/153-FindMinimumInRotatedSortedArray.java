// Last updated: 2/13/2026, 3:16:53 PM
class Solution 
{
    public int findMin(int[] nums) 
    {
        int n = nums.length;
        int l = 0;
        int mid = -1;
        int r = n-1;
        while(l< r)
        {
            mid = l+(r-l)/2;
            if(nums[mid] > nums[r])
            {
                l = mid +1;
            }
            else
            {
                r = mid;
            }
        }
        return nums[l];
    }
}