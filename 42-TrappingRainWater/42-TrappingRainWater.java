// Last updated: 8/21/2026, 3:00:16 PM
1class Solution {
2    public int trap(int[] height) {
3        int water = 0;
4        int left = 0, right = height.length-1;
5        int leftMax = 0, rightMax = 0;
6        while(left < right)
7        {
8            if(height[left] < height[right])
9            {
10                if(height[left] > leftMax)
11                {
12                    leftMax = height[left];
13                }
14                else
15                {
16                    water += leftMax - height[left];
17                }
18                left++;
19            }
20            else
21            {
22                if(height[right] > rightMax)
23                {
24                    rightMax = height[right];
25                }
26                else
27                {
28                    water += rightMax - height[right];
29                }
30                right--;
31            }
32        }
33        return water;
34    }
35}