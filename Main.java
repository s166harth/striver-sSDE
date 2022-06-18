class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int[] maxRight = new int[n];
        int[] maxLeft = new int[n];
        maxLeft[0] = height[0];
        for (int i = 1; i < n; i++) {
            maxLeft[i] = Math.max(height[i], maxLeft[i - 1]);
        }
        maxRight[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxRight[i] = Math.max(height[i], maxRight[i + 1]);
        }
        int trap = 0;
        for (int i = 1; i < n - 1; i++) {
            int min = Math.min(maxRight[i + 1], maxLeft[i - 1]);
            if (min - height[i] > 0)
                trap += Math.max(0, min - height[i]);
        }
        return trap;
    }
}