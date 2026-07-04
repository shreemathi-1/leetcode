// Last updated: 7/4/2026, 10:26:13 PM
1class Solution {
2    int[] root;
3
4    private int find(int x) {
5        if (root[x] != x) {
6            root[x] = find(root[x]);
7        }
8        return root[x];
9    }
10
11    public int minScore(int n, int[][] roads) {
12        root = new int[n + 1];
13
14        for (int i = 0; i <= n; i++) {
15            root[i] = i;
16        }
17
18        for (int[] road : roads) {
19            int x = road[0];
20            int y = road[1];
21
22            root[find(x)] = find(y);
23        }
24
25        int res = 1_000_000_000;
26        int g1 = find(1);
27
28        for (int[] road : roads) {
29            int x = road[0];
30            int d = road[2];
31
32            if (find(x) == g1) {
33                res = Math.min(res, d);
34            }
35        }
36
37        return res;
38    }
39}