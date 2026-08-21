// Last updated: 8/21/2026, 12:07:22 PM
1class Solution {
2    public int findDuplicate(int[] nums) {
3        int slow = nums[0];
4        int fast = nums[0];
5        do
6        {
7            slow = nums[slow];
8            fast = nums[nums[fast]];
9        }while(slow != fast);
10        slow = nums[0];
11        while(slow != fast)
12        {
13            slow = nums[slow];
14            fast = nums[fast];
15        }
16        return slow;
17    }
18}