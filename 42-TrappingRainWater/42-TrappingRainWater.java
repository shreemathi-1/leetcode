// Last updated: 3/2/2026, 8:46:02 PM
class Solution {
    public int trap(int[] ar) {
        int[] leftMax = new int[ar.length];
        int[] rightMax = new int[ar.length];
        int maxWater = 0;
        leftMax[0] = ar[0];
        rightMax[ar.length - 1] = ar[ar.length-1];
        for (int i = 1; i < ar.length; i++) {
            leftMax[i] = Math.max(leftMax[i-1], ar[i]);
        }
        for (int i = ar.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1],ar[i]);
        }

        for (int i = 1; i < ar.length-1; i++) {
            maxWater += Math.min(leftMax[i], rightMax[i]) - ar[i];
        }
        return maxWater;
    }
}