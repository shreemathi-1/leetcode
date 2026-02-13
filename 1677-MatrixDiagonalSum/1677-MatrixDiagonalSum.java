// Last updated: 2/13/2026, 3:15:30 PM
class Solution {
    public int diagonalSum(int[][] mat) 
    {
        int pSum =0 ,sSum = 0;
        int n = mat.length;
        int center = mat[n/2][n/2];
        for(int i =0;i<n;i++)
        {
            for(int j =0;j<n;j++)
            {
                
                if(i == j)
                {
                    pSum += mat[i][j];

                }
                if(i+j == n-1)
                {
                    sSum += mat[i][j];
                }
            }
        }
        int sum = pSum + sSum;

        if(n%2 != 0)
        {
            return sum-center; 
        }
        else
        {
            return sum;
        }

    }
}