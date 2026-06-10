// Last updated: 6/10/2026, 10:30:21 PM
1class Solution 
2{
3    public int diagonalSum(int[][] mat) 
4    {
5        int sum =0;
6        for(int i =0;i<mat.length;i++)
7        {
8            sum += mat[i][i];
9        }
10        for(int i =0;i<mat[0].length;i++)
11        {
12            sum += mat[i][mat.length - i - 1];
13        }
14           if(mat.length % 2 != 0)
15                sum -= mat[mat.length/2][mat.length/2];
16        return sum;
17    }
18}