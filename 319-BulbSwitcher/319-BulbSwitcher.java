// Last updated: 6/6/2026, 2:28:17 PM
1class Solution {
2    public int maxSum(int[][] grid) {
3        int maxSum =0;
4        int sum =0;
5        for(int i =0;i<grid.length-2;i++)
6        {
7            for(int j =0;j<grid[0].length-2;j++)
8            {
9                sum = grid[i][j]+grid[i][j+1] + grid[i][j+2]
10                + grid[i+1][j+1] + grid[i+2][j] + grid[i+2][j+1] 
11                + grid[i+2][j+2];
12                maxSum = Math.max(sum , maxSum);
13            }
14        }
15        return maxSum;
16    }
17}