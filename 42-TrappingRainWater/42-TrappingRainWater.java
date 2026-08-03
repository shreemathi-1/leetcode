// Last updated: 8/3/2026, 4:21:04 PM
1class Solution {
2    public int trap(int[] height) {
3        int left =0 , right = height.length-1;
4        int lMax = 0 , rMax = 0 , water =0 ;
5        while(left < right)
6        {
7            if(height[left] < height[right])
8            {
9                if(height[left] > lMax)
10                {
11                    lMax = height[left];
12                }
13                else
14                {
15                    water += lMax - height[left];
16                }
17                left++;
18            }
19            else
20            {
21                if(height[right] > rMax)
22                {
23                    rMax = height[right];
24                }
25                else
26                {
27                    water += rMax - height[right];
28                }
29                right--;
30            }
31        }
32        return water;
33    }
34}