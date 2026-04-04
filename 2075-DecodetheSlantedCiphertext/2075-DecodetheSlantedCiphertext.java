// Last updated: 4/4/2026, 10:21:31 AM
1class Solution {
2    public String decodeCiphertext(String s, int rows) {
3        if (s.isEmpty()) return s;
4
5        int n = s.length();
6        int cols = (n + rows - 1) / rows;
7
8        StringBuilder res = new StringBuilder();
9
10        for (int start = 0; start < cols; start++) {
11            int r = 0, c = start;
12            while (r < rows && c < cols) {
13                res.append(s.charAt(r * cols + c));
14                r++; c++;
15            }
16        }
17
18        int i = res.length();
19        while (i > 0 && res.charAt(i - 1) == ' ') i--;
20        return res.substring(0, i);
21    }
22}