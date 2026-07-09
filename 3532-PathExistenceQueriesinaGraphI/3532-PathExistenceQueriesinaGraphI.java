// Last updated: 7/9/2026, 5:12:22 PM
1class Solution {
2    public boolean[] pathExistenceQueries(int n, int[] nums, int maxDiff, int[][] queries) {
3        boolean[] res = new boolean[queries.length];
4        int color = 0,idx = 0;
5        int[] colorArray = new int[n];
6        for(int i = 1 ; i < n ; i++){
7            colorArray[i] = nums[i] - nums[i - 1] <= maxDiff ? color : ++color;
8        }
9        for(int[] q : queries){
10                res[idx++] = colorArray[q[0]] == colorArray[q[1]];
11        }
12        return res;
13    }
14}