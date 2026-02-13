// Last updated: 2/13/2026, 3:16:56 PM
class Solution {
    public int maxProduct(int[] nums) {
        int maxEnding = nums[0];
        int minEnding = nums[0];
        int maxProduct = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int curr = nums[i];

            if (curr < 0) {
                // swap
                int temp = maxEnding;
                maxEnding = minEnding;
                minEnding = temp;
            }

            maxEnding = Math.max(curr, maxEnding * curr);
            minEnding = Math.min(curr, minEnding * curr);

            maxProduct = Math.max(maxProduct, maxEnding);
        }
        return maxProduct;
    }
}
