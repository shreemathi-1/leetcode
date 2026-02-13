// Last updated: 2/13/2026, 3:15:33 PM
class Solution 
{
    public int[] runningSum(int[] nums) 
    {
        int n = nums.length;
        int[] arr = new int[n];
        if(n >=1)
        {
            int sum =0;                        
            for(int i =0;i<n;i++)
            {           
                sum += nums[i];
                arr[i] = sum;
            }
        }
        return arr; 
    }
}