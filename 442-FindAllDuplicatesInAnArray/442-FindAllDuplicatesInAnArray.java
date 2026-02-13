// Last updated: 2/13/2026, 3:15:57 PM
class Solution 
{
    public List<Integer> findDuplicates(int[] nums) 
    {
        ArrayList<Integer> l = new ArrayList<>();
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();
        if(n ==0 || n==1)
        {
            return l;
        }
        
        for(int i=0;i<n;i++)
        {
            if(set.contains(nums[i]))
            {
                l.add(nums[i]);
            }
            set.add(nums[i]);
        }
        return l;
    }
}