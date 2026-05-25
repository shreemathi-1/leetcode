// Last updated: 5/25/2026, 9:23:27 PM
1class Solution {
2    public List<List<Integer>> combinationSum(int[] candidates, int target) {
3        List<List<Integer>> result = new ArrayList<>();
4        backtrack(candidates, target, 0, new ArrayList<>(), result, 0);
5        return result;
6    }
7    
8    private void backtrack(int[] candidates, int target, int start, 
9                          List<Integer> current, List<List<Integer>> result, int sum) {
10        if (sum == target) {
11            result.add(new ArrayList<>(current));
12            return;
13        }
14        
15        if (sum > target) {
16            return;
17        }
18
19        for (int i = start; i < candidates.length; i++) {
20            current.add(candidates[i]);
21            backtrack(candidates, target, i, current, result, sum + candidates[i]);
22            current.remove(current.size() - 1);
23        }
24    }
25}