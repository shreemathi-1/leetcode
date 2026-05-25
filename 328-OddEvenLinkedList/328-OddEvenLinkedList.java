// Last updated: 5/25/2026, 9:09:19 PM
1class Solution {
2    public int longestConsecutive(int[] nums) {
3        HashSet<Integer> st = new HashSet<>();
4        for (int num : nums) {
5            st.add(num);
6        }
7        int maxStreak = 0;
8        for (int num : st) {
9            if (!st.contains(num - 1)) {
10                int currNum = num;
11                int currStreak = 1;
12                while (st.contains(currNum + 1)) {
13                    currStreak++;
14                    currNum++;
15                }
16                maxStreak = Math.max(maxStreak, currStreak);
17            }
18        }
19        return maxStreak;
20    }
21}