// Last updated: 8/21/2026, 2:26:30 PM
1class Solution {
2    public int maxArea(int[] height) {
3        int maxArea = 0;
4        int left  = 0, right = height.length -1;
5        for(int i = 0; i<height.length; i++)
6        {
7            int width = right - left;
8            int area = Math.min(height[left],height[right]) * width;
9            maxArea = Math.max(area,maxArea);
10            if(height[left] < height[right])
11            {
12                left++;
13            }
14            else
15            {
16                right--;
17            }
18        }
19        return maxArea;
20    }
21}