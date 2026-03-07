// Last updated: 3/7/2026, 4:18:22 PM
1class Solution
2 {
3    public int diagonalSum(int[][] mat) 
4    {
5        int m = mat.length;
6        int n = mat[0].length;
7        int sum =0;
8        for(int i =0;i<m;i++)
9        {
10            sum += mat[i][i];
11            sum += mat[i][n-i-1];
12        }
13        if(m %2 !=0)
14        {
15            sum -= mat[n/2][n/2];
16        }
17        return sum;
18    }
19}