// Last updated: 6/18/2026, 12:23:16 AM
1class Solution {
2    public char processStr(String s, long k) {
3        long len = 0;
4
5        // Step 1
6        for (char c : s.toCharArray()) {
7            if (c == '*') len = Math.max(0, len - 1);
8            else if (c == '#') len *= 2;
9            else if (c != '%') len++;
10        }
11
12        if (k >= len) return '.';
13
14        // Step 2
15        for (int i = s.length() - 1; i >= 0; i--) {
16            char c = s.charAt(i);
17
18            if (c == '*') len++;
19
20            else if (c == '#') {
21                long half = len / 2;
22                if (k >= half) k -= half;
23                len = half;
24            }
25
26            else if (c == '%') {
27                k = len - 1 - k;
28            }
29
30            else {
31                if (k == len - 1) return c;
32                len--;
33            }
34        }
35
36        return '.';
37    }
38}