// Last updated: 7/1/2026, 11:02:08 PM
1class NumArray {
2    int prefix[]; 
3    public NumArray(int[] nums) {
4        prefix = new int[nums.length];
5        prefix[0] = nums[0];
6        for(int i =1;i<nums.length;i++)
7        {
8            prefix[i] = prefix[i-1] + nums[i];
9        }
10    }
11    
12    public int sumRange(int left, int right) {
13        if(left == 0)
14        {
15            return prefix[right];
16        }
17        return prefix[right] - prefix[left-1];
18    }
19}
20
21/**
22 * Your NumArray object will be instantiated and called as such:
23 * NumArray obj = new NumArray(nums);
24 * int param_1 = obj.sumRange(left,right);
25 */