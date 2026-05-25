// Last updated: 5/25/2026, 9:23:53 PM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> result = new ArrayList<>();
4        backtrack(candidates, target, 0, new ArrayList<>(), result, 0);
5        return result;
6    }
7    private void backtrack(int[] candidates, int target, int start, 
8                          List<Integer> current, List<List<Integer>> result, int sum) {
9        if (sum == target) {
10            result.add(new ArrayList<>(current));
11            return;
12        }
13        if (sum > target) 
14            return;
15        for (int i = start; i < candidates.length; i++) {
16            current.add(candidates[i]);
17            backtrack(candidates, target, i, current, result, sum + candidates[i]);
18            current.remove(current.size() - 1);
19        }
20    }
21}