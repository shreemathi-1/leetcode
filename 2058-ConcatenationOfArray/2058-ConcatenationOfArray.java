// Last updated: 2/13/2026, 3:15:28 PM
class Solution {
    public int[] getConcatenation(int[] nums) 
    {
        int n = nums.length;
        int[] ans = new int[2*n];
        for(int i =0;i<n;i++)
        {
            ans[i] = nums[i];
        }
        int j =0;
         for(int i =n;i<2*n;i++)
         {
            ans[i] = nums[j++];
         }
         return ans;
    }
}