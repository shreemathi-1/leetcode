// Last updated: 6/7/2026, 7:38:39 PM
1class Solution {
2    public int longestOnes(int[] nums, int k) {
3        int flip =0 ,max =0;
4        int ws =0;
5        for(int we =0; we < nums.length ; we++)
6        {
7           if(nums[we] == 0)
8           {
9                flip++;
10           }
11           while(flip > k)
12           {
13            if(nums[ws] ==0)
14            {
15                flip--;
16            }
17            ws++;               
18           }
19           max = Math.max(max, we - ws + 1);
20        }
21        return max ;
22    }
23}