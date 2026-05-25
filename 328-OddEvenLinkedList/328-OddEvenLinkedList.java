// Last updated: 5/25/2026, 9:18:52 PM
1class Solution {
2    public void backtrack(int[] nums, int start, List<List<Integer>> result) {
3        if (start == nums.length) {
4            List<Integer> current = new ArrayList<>();
5            for (int num : nums) {
6                current.add(num);
7            }
8            result.add(current);
9            return;
10        }
11        for (int i = start; i < nums.length; i++) {
12            swap(nums, start, i);
13            backtrack(nums, start + 1, result);
14            swap(nums, start, i); // backtrack
15        }
16    }
17
18    private void swap(int[] nums, int i, int j) {
19        int temp = nums[i];
20        nums[i] = nums[j];
21        nums[j] = temp;
22    }
23
24    public List<List<Integer>> permute(int[] nums) {
25        List<List<Integer>> result = new ArrayList<>();
26        backtrack(nums, 0, result);
27        return result;
28    }
29}