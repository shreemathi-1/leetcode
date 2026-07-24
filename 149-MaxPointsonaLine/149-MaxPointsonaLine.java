// Last updated: 7/24/2026, 5:34:58 PM
1class Solution {
2    public int maxPoints(int[][] points) {
3        int n = points.length;
4
5        if (n <= 2) {
6            return n;
7        }
8
9        int ans = 0;
10
11        for (int i = 0; i < n; i++) {
12            HashMap<String, Integer> map = new HashMap<>();
13            int max = 0;
14
15            for (int j = i + 1; j < n; j++) {
16                int dx = points[j][0] - points[i][0];
17                int dy = points[j][1] - points[i][1];
18
19                int g = gcd(dx, dy);
20                dx /= g;
21                dy /= g;
22
23                if (dx < 0) {
24                    dx = -dx;
25                    dy = -dy;
26                } else if (dx == 0) {
27                    dy = 1;
28                } else if (dy == 0) {
29                    dx = 1;
30                }
31
32                String key = dx + "#" + dy;
33
34                int count = map.getOrDefault(key, 0) + 1;
35                map.put(key, count);
36
37                max = Math.max(max, count);
38            }
39
40            ans = Math.max(ans, max + 1);
41        }
42
43        return ans;
44    }
45
46    private int gcd(int a, int b) {
47        a = Math.abs(a);
48        b = Math.abs(b);
49
50        while (b != 0) {
51            int temp = a % b;
52            a = b;
53            b = temp;
54        }
55
56        return a;
57    }
58}