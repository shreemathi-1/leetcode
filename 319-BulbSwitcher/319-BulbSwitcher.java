// Last updated: 6/6/2026, 3:43:14 PM
1class Solution {
2    public int[] reverse(int[] row)
3    {
4        int l=0,r=row.length-1;
5        while(l<r)
6        {
7           int temp = row[l];
8           row[l] = row[r];
9           row[r] = temp;
10           l++;
11           r--;
12        }
13        return row;
14    }
15    public void rotate(int[][] matrix) {
16        for(int i =0;i<matrix.length;i++)
17        {
18            for(int j =i+1;j<matrix[0].length;j++)
19            {
20                int temp = matrix[i][j];
21                matrix[i][j] = matrix[j][i];
22                matrix[j][i] = temp;
23            }
24        }
25          for(int i=0;i<matrix.length;i++)
26            {
27                reverse(matrix[i]);
28            }
29    }
30}