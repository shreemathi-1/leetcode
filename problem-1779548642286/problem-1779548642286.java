// Last updated: 5/23/2026, 8:34:02 PM
1class Solution {
2    public int minimumSwaps(int[] nums) {
3        int i=0,j=nums.length-1;
4        int c=0;
5        while(i<=j)
6        {
7            if(nums[i] != 0)
8            {
9                i++;
10            }
11            else if(nums[j] == 0)
12            {
13                j--;
14            }
15            else
16            {
17                int temp = nums[i];
18                nums[i] = nums[j];
19                nums[j] = temp;
20                c++;
21            }
22        }
23        return c;
24    }
25}