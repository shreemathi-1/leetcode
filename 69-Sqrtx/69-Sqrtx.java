// Last updated: 2/13/2026, 3:17:16 PM
class Solution {
    public int mySqrt(int x) 
    {       
        int l =0;
        int r = x/2;
        int mid =0,ans=0;
        if(x==0 || x==1) return x;  // x =0,1
    
        while(l <= r)
        {
            mid = l + (r-l)/2;           
              long sq = (long)mid*mid;
            if(sq == x)
            {
                return mid;              
                // ans = mid;
                // r = mid -1;
            }
            else if(sq < x)
            {
                ans = mid;
                l = mid +1;
            }
            else
            {
                r = mid -1;
                
            }
        }
        
        return ans;
       
    }
}