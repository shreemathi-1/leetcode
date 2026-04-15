// Last updated: 4/15/2026, 8:33:36 PM
1class Solution {
2    public int thirdMax(int[] nums) {
3        int count = 0;
4        Arrays.sort(nums);
5        for(int i = nums.length - 1; i > 0; i--){
6            if(nums[i] != nums[i - 1]) count++;
7            if(count == 2) return nums[i - 1];
8        }
9        return nums[nums.length - 1];
10    }
11}