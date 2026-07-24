// Last updated: 7/24/2026, 5:33:10 PM
1class Solution {
2    public boolean reachingPoints(int sx, int sy, int tx, int ty) {
3        while (tx >= sx && ty >= sy) {
4            if (tx == sx) {
5                return (ty - sy) % tx == 0;
6            }
7            if (ty == sy) {
8                return (tx - sx) % ty == 0;
9            }
10            if (ty > tx) {
11                ty = ty % tx;
12            } else {
13                tx = tx % ty;
14            }
15        }
16        return false;
17    }
18}