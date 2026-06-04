// Last updated: 6/4/2026, 2:10:44 PM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int max =0,flip=0, ws =0;
4        for(int we =0;we<nums.length;we++)
5        {
6            if(nums[we] ==0)
7            {
8                flip++;
9            }
10            while(flip > k)
11            {
12                if(nums[ws] ==0)
13                {
14                    flip--;
15                }
16                ws++;
17            }
18            max = Math.max(max,we-ws+1);
19        }
20    return max;
21    }
22}