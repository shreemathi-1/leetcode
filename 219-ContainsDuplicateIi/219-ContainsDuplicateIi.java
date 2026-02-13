// Last updated: 2/13/2026, 3:16:29 PM
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) 
    {
        int n =nums.length;
        int l =0;
        int r =n-1;
        for(int i =0;i<n;i++)
        {
            for(int j =i+1;j-i<=k && j<n;j++)
            {
                 if(nums[i] == nums[j] && Math.abs(i-j) <=k)
                {
                    return true;
                }
            }
        }
        
        return false;
    }
}