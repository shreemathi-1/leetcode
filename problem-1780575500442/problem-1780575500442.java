// Last updated: 6/4/2026, 5:48:20 PM
1class Solution {
2    public int longestSubarray(int[] nums) {
3        int ws =0, max =0 , del =0;
4        for(int we=0;we<nums.length;we++)
5        {
6            if(nums[we] ==0)
7            {
8                del++;
9            } 
10             while(del >1)
11             {
12                if(nums[ws] ==0)
13                {
14                    del--;
15                }
16                ws++;
17             }
18            
19            max = Math.max(max,we-ws);
20        }
21        return max;
22    }
23}