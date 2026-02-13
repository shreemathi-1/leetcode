// Last updated: 2/13/2026, 3:15:13 PM
class Solution {
    public int maximumWealth(int[][] accounts) 
    {
        int n1 = accounts.length;
        int n2 = accounts[0].length;
        
        int max = Integer.MIN_VALUE;
        for(int i =0;i<n1;i++)
        {
            int sum =0;
            for(int j =0;j<n2;j++)
            {
                sum += accounts[i][j];
                              
            } 
             if( sum > max)
                {
                    max = sum;
                }            
        }
        return max;       
    }
}