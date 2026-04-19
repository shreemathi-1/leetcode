// Last updated: 4/19/2026, 8:16:02 PM
1class Solution {
2    public int romanToInt(String s) {
3       int total = 0;
4
5        for (int i = 0; i < s.length(); i++) {
6            int current = value(s.charAt(i));
7
8            if (i + 1 < s.length() && current < value(s.charAt(i + 1))) {
9                total -= current;
10            } else {
11                total += current;
12            }
13        }
14
15        return total;
16    }
17
18    private int value(char ch) {
19        switch (ch) {
20            case 'I': return 1;
21            case 'V': return 5;
22            case 'X': return 10;
23            case 'L': return 50;
24            case 'C': return 100;
25            case 'D': return 500;
26            case 'M': return 1000;
27            default: return 0;
28        }
29    }
30}