// Last updated: 6/6/2026, 2:29:07 PM
1class Solution {
2    public int maxSum(int[][] grid) {
3        int maxSum =0;
4        for(int i =0;i<grid.length-2;i++)
5        {
6            for(int j =0;j<grid[0].length-2;j++)
7            {
8                int sum = grid[i][j]+grid[i][j+1] + grid[i][j+2]
9                + grid[i+1][j+1] + grid[i+2][j] + grid[i+2][j+1] 
10                + grid[i+2][j+2];
11                maxSum = Math.max(sum , maxSum);
12            }
13        }
14        return maxSum;
15    }
16}