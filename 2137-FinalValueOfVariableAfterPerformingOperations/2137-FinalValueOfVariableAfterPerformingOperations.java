// Last updated: 2/13/2026, 3:15:22 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) 
    {
        int x = 0;
        int n = operations.length;
        for(int i =0;i<n;i++)
        {
            
            switch(operations[i])
            {
                case "++X":
                    ++x;
                    break;
                case "X++":
                    x++;
                    break;
                 case "X--":
                    x--;
                    break;
                case "--X":
                   --x;
                   break;           
            }

        }
        return x;
    }
}