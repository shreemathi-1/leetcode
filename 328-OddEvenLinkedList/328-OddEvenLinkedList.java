// Last updated: 5/25/2026, 9:18:44 PM
1import java.util.ArrayList;
2import java.util.List;
3
4class Solution {
5    public void backtrack(int[] nums, int start, List<List<Integer>> result) {
6        if (start == nums.length) {
7            List<Integer> current = new ArrayList<>();
8            for (int num : nums) {
9                current.add(num);
10            }
11            result.add(current);
12            return;
13        }
14        for (int i = start; i < nums.length; i++) {
15            swap(nums, start, i);
16            backtrack(nums, start + 1, result);
17            swap(nums, start, i); // backtrack
18        }
19    }
20
21    private void swap(int[] nums, int i, int j) {
22        int temp = nums[i];
23        nums[i] = nums[j];
24        nums[j] = temp;
25    }
26
27    public List<List<Integer>> permute(int[] nums) {
28        List<List<Integer>> result = new ArrayList<>();
29        backtrack(nums, 0, result);
30        return result;
31    }
32}