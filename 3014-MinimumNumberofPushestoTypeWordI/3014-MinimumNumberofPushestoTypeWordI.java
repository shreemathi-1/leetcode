// Last updated: 7/30/2026, 9:15:10 PM
1class Solution {
2    public int minimumPushes(String word) {
3
4        int pushes = 0;
5
6        for (int i = 0; i < word.length(); i++) {
7
8            pushes += (i / 8) + 1;
9        }
10
11        return pushes;
12    }
13}