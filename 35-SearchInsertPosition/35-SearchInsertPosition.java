// Last updated: 2/13/2026, 3:17:51 PM
class Solution {
    public int searchInsert(int[] nums, int target) 
    {
        int n = nums.length;
        int ans =0;
        int l =0;
        int r =n-1;
        int found = 0;
        int mid =0;
        while(l <= r)
        {
             mid = l + (r-l) /2;
            if(nums[mid] == target)
            {
                
                found =1;
                break;
                
            }
            else if(nums[mid] < target)
            {
                l = mid+1;
            }
            else
            {
                r = mid -1;
            }
        }
        if(found ==1)
        return mid;
        else
        return l;
       
    }
}