// Last updated: 5/25/2026, 9:25:44 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int n = nums.length;
4        int l =0;
5        int r = n-1;
6        int mid =0;
7        while(l <= r){
8            mid = l + (r-l)/2;
9            if(nums[mid] == target)
10                return mid;
11            else if(nums[mid] < target)
12                l = mid+1;
13            else
14                r = mid -1;
15        }
16        return -1;
17    }
18}