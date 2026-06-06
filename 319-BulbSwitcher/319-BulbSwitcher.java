// Last updated: 6/6/2026, 2:58:03 PM
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
14
15// OPTIMIZED CODE : works only for SQUARE MATRIX : 
16//   for(int i =0;i<matrix.length;i++)
17//         {
18//             for(int j =i+1;j<matrix[0].length;j++)
19//             {
20//                 int temp = matrix[i][j];
21//                 matrix[i][j] = matrix[j][i];
22//                 matrix[j][i] = temp;
23//             }
24//         }
25// return matrix;