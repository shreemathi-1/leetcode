// Last updated: 2/13/2026, 3:17:24 PM
class Solution 
{
    public int[][] generateMatrix(int n)
    {
        int[][] mat = new int[n][n];
        int top =0,bott = n-1;
        int left =0,right = n-1;
        int num =1;
        while(top<= bott && left <= right)
        {
            for(int j=left ;j <= right;j++)
            {
                mat[top][j] =num++ ;
            }
            top++;
            for(int i =top;i<=bott;i++)
            {
                mat[i][right] = num++;
            }
            right--;
            if(top <= bott)
            {
               for(int j =right;j>=left;j--)
                mat[bott][j] = num++;
                bott--;
            }
            
            if(left<= right)
            {
                for(int i=bott;i>=top;i--)
                {
                    mat[i][left] = num++;
                }
                left++;
            }
            
        }
        return mat;
    }
}