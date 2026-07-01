// Last updated: 7/1/2026, 3:00:57 PM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int left = 0;
4        int max = 0;
5        int flip=0;
6        for (int r = 0; r < nums.length; r++) 
7        {
8               
9            if(nums[r] == 0)
10            {
11                flip++;
12            }
13            while(flip > k)
14            {    
15                if(nums[left] == 0 )     
16                  flip--;
17                left++;
18            }
19            max = Math.max(max,r-left+1); 
20             
21        }
22        return max;
23    }
24}