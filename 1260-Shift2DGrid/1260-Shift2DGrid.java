// Last updated: 7/20/2026, 5:48:40 PM
1class Solution {
2    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
3
4        int m = grid.length;
5        int n = grid[0].length;
6
7        int total = m * n;
8
9        k %= total;
10
11        List<List<Integer>> ans = new ArrayList<>();
12
13        for (int i = 0; i < m; i++) {
14            List<Integer> row = new ArrayList<>();
15
16            for (int j = 0; j < n; j++) {
17                row.add(0);
18            }
19
20            ans.add(row);
21        }
22
23        for (int i = 0; i < m; i++) {
24            for (int j = 0; j < n; j++) {
25
26                int oldIndex = i * n + j;
27
28                int newIndex = (oldIndex + k) % total;
29
30                int newRow = newIndex / n;
31                int newCol = newIndex % n;
32
33                ans.get(newRow).set(newCol, grid[i][j]);
34            }
35        }
36
37        return ans;
38    }
39}