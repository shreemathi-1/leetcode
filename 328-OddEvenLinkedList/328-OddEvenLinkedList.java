// Last updated: 5/25/2026, 9:17:49 PM
1class Solution {
2    public List<List<Integer>> subsets(int[] nums) {
3        List<List<Integer>> outer = new ArrayList<>();
4        outer.add(new ArrayList<>());
5        
6        for(int num : nums){
7            int n = outer.size();
8            for(int i = 0; i < n; i++){
9                List<Integer> internal = new ArrayList<>(outer.get(i));
10                internal.add(num);
11                outer.add(internal); 
12            }
13        }
14        return outer;
15    }
16}