// Last updated: 7/3/2026, 9:54:03 PM
1class Solution {
2    private int[] head, next, to, weight;
3    private long k;
4    private int n;
5    public int findMaxPathScore(int[][] edges, boolean[] online, long k) {
6        this.n = online.length;
7        this.k = k;
8
9        int m = edges.length;
10        this.head = new int[n];
11        this.next = new int[m];
12        this.to = new int[m];
13        this.weight = new int[m];
14        Arrays.fill(head, -1);
15        int left = Integer.MAX_VALUE, right = 0;
16        for(int i = 0; i < m; i++) {
17            int a = edges[i][0], b = edges[i][1], c = edges[i][2];
18            if(online[a] && online[b]) {
19                to[i] = b;
20                next[i] = head[a];
21                weight[i] = c;
22                head[a] = i;
23
24                if(c > right) right = c;
25                if(c < left) left = c;
26            }
27        }
28
29        if(!check(0)) return -1;
30
31        while(left < right) {
32            int mid = left + right + 1 >>> 1;
33            if(check(mid)) left = mid;
34            else right = mid - 1;
35        }
36        return left;
37    }
38
39    private static final int[] queue = new int[50001];
40    private static final long[] sum = new long[50001];
41    private boolean check(int threshold) {
42        long[] dist = new long[n];
43        Arrays.fill(dist, k + 1);
44        dist[0] = 0;
45
46        int read = 0, write = 1;
47        while(read < write) {
48            int current = queue[read];
49            long val = sum[read++];
50            if(val > dist[current]) continue;
51            for(int i = head[current]; i != -1; i = next[i]) {
52                if(weight[i] < threshold) continue;
53                int nextIndex = to[i];
54                long d = val + weight[i];
55                if(d < dist[nextIndex]) {
56                    if(nextIndex == n - 1) return true;
57                    dist[nextIndex] = d;
58                    sum[write] = d;
59                    queue[write++] = nextIndex;
60                }
61            }
62        }
63        return false;
64    }
65    private static final class Node {
66        private final int index;
67        private final long dist;
68        private Node(int index, long dist) {
69            this.index = index;
70            this.dist = dist;
71        }
72    }
73}