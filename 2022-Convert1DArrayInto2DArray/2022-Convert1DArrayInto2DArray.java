// Last updated: 3/7/2026, 4:14:25 PM
1class Solution 
2{
3    public int[][] construct2DArray(int[] original, int m, int n) 
4    {
5        if(original.length != m*n)
6        {
7            return new int[][]{};
8        }
9        int mat[][] = new int[m][n];
10        for(int i =0;i<original.length;i++)
11        {
12            int row = i/n;
13            int col = i%n;
14            mat[row][col] = original[i];
15        }
16        return mat;
17    }
18}