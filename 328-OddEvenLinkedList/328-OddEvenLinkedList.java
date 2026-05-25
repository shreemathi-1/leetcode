// Last updated: 5/25/2026, 9:40:50 PM
1class Solution {
2    public int search(int[] nums, int target) {
3        int low = 0, high = nums.length - 1;
4        while (low <= high) {
5            int mid = (low + high) / 2;
6            if (nums[mid] == target) 
7                return mid;
8            if (nums[low] <= nums[mid]) {
9                if (nums[low] <= target && target < nums[mid]) 
10                    high = mid - 1;
11                 else 
12                    low = mid + 1;
13            } else {
14                if (nums[mid] < target && target <= nums[high]) 
15                    low = mid + 1;
16                 else 
17                    high = mid - 1;  
18            }
19        }
20        return -1;
21    }
22}