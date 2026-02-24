// Last updated: 2/24/2026, 7:05:57 AM
1class Solution 
2{
3    public int trap(int[] height)
4     {
5        int len = height.length;
6        
7        int water =0;
8        int[] rightMax = new int[len];
9        int[] leftMax = new int[len];
10        leftMax[0] = height[0];
11        rightMax[len-1] = height[len-1];
12        for(int i =1;i<len;i++)
13        {
14            leftMax[i] = Math.max(height[i],leftMax[i-1]);
15           
16        }
17           for(int i =len -2;i>=0;i--)
18           {
19            rightMax[i] = Math.max(height[i],rightMax[i+1]);
20           }
21        for(int i =0;i<len;i++)
22        {
23            water += Math.min(leftMax[i],rightMax[i]) - height[i];
24        }
25        return water;
26    }
27}