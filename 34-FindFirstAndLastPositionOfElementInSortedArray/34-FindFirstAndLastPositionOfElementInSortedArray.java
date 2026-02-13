// Last updated: 2/13/2026, 3:17:52 PM
class Solution {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{findOccurence(nums, target), lastOccurence(nums, target)};
    }

    // Helper to find the First (Leftmost) Occurrence
    public static int findOccurence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            // If we found the target or something larger, keep looking to the LEFT
            // to see if there is an earlier occurrence.
            if (nums[mid] >= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        
        // 'end' is now at the index just BEFORE the first target.
        // Check if 'end + 1' is valid and equals the target.
        if ((end + 1 < nums.length) && nums[end + 1] == target) {
            return end + 1;
        }
        return -1;
    }

    // Helper to find the Last (Rightmost) Occurrence
    public static int lastOccurence(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            
            // If we found the target or something smaller, keep looking to the RIGHT
            // to see if there is a later occurrence.
            if (nums[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        
        // 'start' is now at the index just AFTER the last target.
        // Check if 'start - 1' is valid and equals the target.
        if ((start - 1 >= 0) && nums[start - 1] == target) {
            return start - 1;
        }
        return -1;
    }
}