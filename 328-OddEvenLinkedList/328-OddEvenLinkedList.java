// Last updated: 5/25/2026, 9:38:41 PM
1class Solution 
2{
3    public int findPeakElement(int[] nums) 
4    {
5        int n = nums.length;
6        int l =0;
7        int r = n-1;
8        int mid =0;
9        while(l<r)
10        {  
11            mid = l+ (r-l) /2;             
12            if(nums[mid] > nums[mid+1])
13            {
14                r = mid ;
15            }
16            else
17            {
18                l = mid +1;
19            }
20
21        }
22        return l;
23    }
24}