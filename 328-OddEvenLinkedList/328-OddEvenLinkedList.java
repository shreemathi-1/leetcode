// Last updated: 5/25/2026, 9:26:36 PM
1class Solution {
2    public int searchInsert(int[] nums, int target) 
3    {
4        int n = nums.length;
5        int ans =0;
6        int l =0;
7        int r =n-1;
8        int found = 0;
9        int mid =0;
10        while(l <= r)
11        {
12             mid = l + (r-l) /2;
13            if(nums[mid] == target)
14            {
15                
16                found =1;
17                break;
18                
19            }
20            else if(nums[mid] < target)
21            {
22                l = mid+1;
23            }
24            else
25            {
26                r = mid -1;
27            }
28        }
29        if(found ==1)
30        return mid;
31        else
32        return l;
33       
34    }
35}