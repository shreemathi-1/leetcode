// Last updated: 5/30/2026, 7:24:59 PM
1class Solution 
2{
3    public List<Integer> findDuplicates(int[] nums) 
4    {
5       ArrayList<Integer> res = new ArrayList<>();
6       for(int i =0;i<nums.length;i++)
7       {
8            int index = Math.abs(nums[i]);
9            if(nums[index - 1] < 0)
10            {
11                res.add(Math.abs(nums[i]));
12            }
13            else
14            {
15                nums[index -1 ] = -1 * nums[index - 1];
16            }
17       }
18       return res;
19    }
20}