// Last updated: 2/13/2026, 3:17:26 PM
class Solution 
{
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> list = new ArrayList<Integer>();
        int m = matrix.length;
         int n = matrix[0].length;
         int top = 0,bott = m-1;
         int left = 0,right = n-1;

         while(left <= right && top <=bott)
         {
            for(int j =left;j <=right;j++)
            {
                list.add(matrix[top][j]);           
            }
            top++;

            for(int i =top;i<=bott; i++)
            {
                list.add(matrix[i][right]); 
            }
            right--;

            if(top <= bott)
            {
                for(int j =right;j >=left;j--)
                {
                    list.add(matrix[bott][j]);           
                }
                bott--;
            }
            if(left <= right)
            {
                for(int i =bott;i>=top;i--)
                {
                    list.add(matrix[i][left]); 
                }
                left++;;
            }
            
        }
       return list;  
    }
}