// Last updated: 2/13/2026, 3:17:32 PM
class Solution {
    public void rev(int[] matrix)
    {
        int s = 0;
        int e = matrix.length -1;
        while(s < e)
        {
            int temp = matrix[s];
            matrix[s] = matrix[e];
            matrix[e] = temp;
            s++;
            e--;
        }

    }
    public void transpose(int[][] matrix)
    {
        int n = matrix.length;
        int[][] temp = new int[n][n];
          for(int i =0;i<n;i++)
            {
                for(int j =i+1;j<n;j++)
                {
                    int temp2 = matrix[i][j];
                    matrix[i][j]= matrix[j][i];
                    matrix[j][i] = temp2;
                }           
            }
            
    }   
    public void rotate(int[][] matrix) 
    {
        int n = matrix.length;
        // Main ob = new Main();
        transpose(matrix);

        for(int i =0;i<n;i++)
        {
                rev(matrix[i]);
         
        }
        
    }
}