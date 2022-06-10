import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 4) return res;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i - 1] != nums[i]) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (j == i + 1 || nums[j - 1] != nums[j]) {
                        twoSum(nums, i, j, res, target);
                    }
                }
            }
        }
        return res;
    }
    
    public void twoSum(int[] nums, int first, int second, List<List<Integer>> res, int target) {
        int left = second + 1;
        int right = nums.length - 1;
        while (left < right) {
            int sum = nums[first] + nums[second] + nums[left] + nums[right];
            if (sum > target) {
                right--;
            } else if (sum < target) {
                left++;
            } else {
                res.add(Arrays.asList(nums[first], nums[second], nums[left++], nums[right--]));
                while (left < right && nums[left - 1] == nums[left]) left++;
            }
        }
    }
}