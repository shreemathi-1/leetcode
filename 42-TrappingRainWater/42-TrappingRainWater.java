// Last updated: 2/13/2026, 3:17:41 PM
class Solution 
{
    public int trap(int[] height) 
    {
        int n = height.length;
        int l = 0,r = n-1,lMax =0,rMax=0,res =0;
        while(l<r)
        {
            if(height[l] <= height[r] )
            {
                lMax = Math.max(lMax , height[l]);
                res += lMax - height[l++];
            }
            else
            {
                  rMax = Math.max(rMax , height[r]);
                 res += rMax - height[r--];

            }
        }
        return res;
    }
}