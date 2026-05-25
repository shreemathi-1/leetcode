// Last updated: 5/25/2026, 9:05:57 PM
1class Solution {
2    public int[] intersection(int[] nums1, int[] nums2) {
3        int[] seen = new int[1001];
4        for(int num : nums1) {
5            seen[num] = 1;
6        }
7        ArrayList<Integer> res = new ArrayList<>();
8        for(int num : nums2) {
9            if (seen[num] == 1) {
10                res.add(num);
11                seen[num] = 0;
12            }
13        }
14        int[] ans = new int [res.size()];
15        for (int i = 0; i < res.size(); i++) {
16            ans[i] = res.get(i);
17        }
18        return ans;
19    }
20}