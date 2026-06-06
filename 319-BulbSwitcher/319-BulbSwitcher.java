// Last updated: 6/6/2026, 2:45:47 PM
1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        int[][] trans = new int[matrix[0].length][matrix.length];
4        for(int i =0;i<matrix.length;i++)
5        {
6            for(int j =0;j<matrix[0].length;j++)
7            {
8                trans[j][i] = matrix[i][j];
9            }
10        }
11return trans;
12    }
13}