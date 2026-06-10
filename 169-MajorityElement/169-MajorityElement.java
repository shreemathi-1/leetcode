// Last updated: 6/10/2026, 10:58:45 PM
1class Solution {
2    public int[][] construct2DArray(int[] original, int m, int n) 
3    {
4        if(original.length != m*n)
5        {
6            return new int[][]{};
7        }
8        int mat[][] = new int[m][n];
9        for(int i =0;i< original.length;i++)
10        {
11            mat[i/n][i%n] = original[i];
12        }
13        return mat;
14    }
15}