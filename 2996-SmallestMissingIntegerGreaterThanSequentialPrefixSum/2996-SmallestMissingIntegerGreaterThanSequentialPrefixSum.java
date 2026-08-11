// Last updated: 8/11/2026, 6:38:11 PM
1class Solution {
2    public int missingInteger(int[] nums) {
3        int sum = nums[0];
4
5        for (int i = 1; i < nums.length; i++) {
6            if (nums[i] == nums[i - 1] + 1) {
7                sum += nums[i];
8            } else {
9                break;
10            }
11        }
12
13        java.util.HashSet<Integer> seen = new java.util.HashSet<>();
14
15        for (int num : nums) {
16            seen.add(num);
17        }
18
19        int answer = sum;
20
21        while (seen.contains(answer)) {
22            answer++;
23        }
24
25        return answer;
26    }
27}