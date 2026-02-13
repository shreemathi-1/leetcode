// Last updated: 2/13/2026, 3:17:04 PM
class Solution 
{
    public int singleNumber(int[] nums) 
    {
        int n = nums.length;
        Arrays.sort(nums);
        for(int i =0;i<n-1;i += 2)
        {
            if(nums[i] != nums[i+1])
            {
                return nums[i];
            }

        }
        return nums[n-1];
    }
}