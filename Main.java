class Solution {
    public static int can_have_sum(int [] nums, int target, int i) {
        int low=i, high = nums.length - 1;
        while(low < high) {
            int mid = low + ((high - low) >> 1) + 1;
            if(nums[mid] < target) low = mid;
            else high = mid -1;
        }
    
    return low;
}
 public int triangleNumber(int[] nums) {
     Arrays.sort(nums);
     int cnt = 0;
     for(int i=0;i<nums.length - 2; ++i) {
         for(int g=i+1; g<nums.length - 1; ++g) {
             int low = can_have_sum(nums, nums[i] + nums[g], i);
             if(low - g > 0)
                 cnt += low - g;
            
         }
     }
 return cnt;
}
}