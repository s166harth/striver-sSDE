class Solution {
    public int search(int[] nums, int target) {
        int result = binarySearch(nums, 0, nums.length - 1, target);
        return result;

    }

    public int binarySearch(int[] nums, int low, int high, int target) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] > target) {
                int res1 = binarySearch(nums, low, mid - 1, target);
                if (res1 == -1) {
                    res1 = binarySearch(nums, mid + 1, high, target);
                }
                return res1;
            }
            int res2 = binarySearch(nums, mid + 1, high, target);
            if (res2 == -1) {
                res2 = binarySearch(nums, low, mid - 1, target);
            }
            return res2;
        }
        return -1;
    }
}
