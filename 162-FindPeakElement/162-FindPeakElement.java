// Last updated: 2/13/2026, 3:16:52 PM
class Solution 
{
    public int findPeakElement(int[] nums) 
    {
        int n = nums.length;
        int l =0;
        int r = n-1;
        int mid =0;
        while(l<r)
        {  
            mid = l+ (r-l) /2;             
            if(nums[mid] > nums[mid+1])
            {
                r = mid ;
            }
            else
            {
                l = mid +1;
            }

        }
        return l;
    }
}