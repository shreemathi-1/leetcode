// Last updated: 8/18/2026, 10:47:18 PM
1class Solution {
2    public int[][] merge(int[][] intervals) {
3        if (intervals.length == 0) return new int[0][0];
4
5        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
6
7        List<int[]> merged = new ArrayList<>();
8        merged.add(intervals[0]);
9
10        for (int i = 1; i < intervals.length; i++) {
11            int[] last = merged.get(merged.size() - 1);
12            int[] current = intervals[i];
13
14            if (current[0] <= last[1]) {
15                last[1] = Math.max(last[1], current[1]);
16            } else {
17                merged.add(current);
18            }
19        }
20
21        return merged.toArray(new int[merged.size()][]);
22    }
23}