// Last updated: 7/23/2026, 9:37:50 PM
1class Solution {
2    public int candy(int[] ratings) {
3        int n = ratings.length;
4        int[] candies = new int[n];
5        Arrays.fill(candies, 1);
6
7        // Left to Right
8        for (int i = 1; i < n; i++) {
9            if (ratings[i] > ratings[i - 1]) {
10                candies[i] = candies[i - 1] + 1;
11            }
12        }
13
14        // Right to Left
15        for (int i = n - 2; i >= 0; i--) {
16            if (ratings[i] > ratings[i + 1]) {
17                candies[i] = Math.max(candies[i], candies[i + 1] + 1);
18            }
19        }
20
21        // Total
22        int total = 0;
23        for (int c : candies) {
24            total += c;
25        }
26
27        return total;
28    }
29}