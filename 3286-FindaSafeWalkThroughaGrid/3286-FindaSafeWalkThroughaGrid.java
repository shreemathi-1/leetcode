// Last updated: 7/2/2026, 10:24:05 PM
1class Solution {
2    public boolean findSafeWalk(List<List<Integer>> grid, int health) {
3        int m = grid.size();
4        int n = grid.get(0).size();
5
6        int[][] dist = new int[m][n];
7        for (int i = 0; i < m; i++) {
8            java.util.Arrays.fill(dist[i], Integer.MAX_VALUE);
9        }
10
11        java.util.ArrayDeque<int[]> dq = new java.util.ArrayDeque<>();
12
13        dist[0][0] = grid.get(0).get(0);
14        dq.offerFirst(new int[]{0, 0});
15
16        int[] dir = {-1, 0, 1, 0, -1};
17
18        while (!dq.isEmpty()) {
19            int[] cur = dq.pollFirst();
20            int x = cur[0];
21            int y = cur[1];
22
23            for (int k = 0; k < 4; k++) {
24                int nx = x + dir[k];
25                int ny = y + dir[k + 1];
26
27                if (nx < 0 || ny < 0 || nx >= m || ny >= n)
28                    continue;
29
30                int newCost = dist[x][y] + grid.get(nx).get(ny);
31
32                if (newCost < dist[nx][ny]) {
33                    dist[nx][ny] = newCost;
34
35                    if (grid.get(nx).get(ny) == 0)
36                        dq.offerFirst(new int[]{nx, ny});
37                    else
38                        dq.offerLast(new int[]{nx, ny});
39                }
40            }
41        }
42
43        return dist[m - 1][n - 1] < health;
44    }
45}