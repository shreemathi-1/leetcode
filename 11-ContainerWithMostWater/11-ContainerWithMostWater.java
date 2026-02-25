// Last updated: 2/25/2026, 10:48:41 PM
1class Solution 
2{
3    public int maxArea(int[] height) 
4    {
5        int l = 0;
6        int r = height.length-1;
7        int maxArea = 0,currArea=0;
8        
9        while(l<=r)
10        {
11            currArea =(int) Math.min(height[l],height[r]) * (r-l);
12            maxArea = Math.max(currArea , maxArea);
13            if(height[l] <= height[r])
14            {
15                l++;
16            }
17            else 
18            {
19                r--;
20            }
21        }
22        return maxArea;
23    }
24}