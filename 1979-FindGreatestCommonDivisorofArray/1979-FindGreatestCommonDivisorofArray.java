// Last updated: 7/18/2026, 7:51:24 PM
1class Solution {
2
3    private int gcd(int a, int b) {
4        while (b != 0) {
5            int temp = b;
6            b = a % b;
7            a = temp;
8        }
9
10        return a;
11    }
12
13    public int findGCD(int[] nums) {
14
15        int min = nums[0];
16        int max = nums[0];
17
18        for (int num : nums) {
19            min = Math.min(min, num);
20            max = Math.max(max, num);
21        }
22
23        return gcd(min, max);
24    }
25}