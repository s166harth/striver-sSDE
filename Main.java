class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = firstPosition(nums, target);
        ans[1] = lastPosition(nums, target);
        return ans;
    }
    
    // function for first position (leftmost position)
    private static int firstPosition(int[] nums, int target){
        int si = 0;
        int ei = nums.length-1;
        int pa = -1; // possible ans
        while(si <= ei){
            int mid = (si + ei)/2;
            if(nums[mid] == target){
                pa = mid;
                ei = mid -1; // continue searching in its left
            }
            else if(nums[mid] < target){
                si = mid+1;
            }
            else{
                ei = mid -1;
            }
        }
        return pa;
    }
    
    // function for finding last position (righmost position)
    private static int lastPosition(int[] nums, int target){
        int si = 0;
        int ei = nums.length-1;
        int pa = -1;
        while(si <= ei){
            int mid = (si+ ei)/2;
            if(nums[mid] == target){
                pa = mid;
                si = mid+1; // continue searching in its right
            }
            else if(nums[mid] < target){
                si = mid +1;
            }
            else{
                ei = mid -1;
            }
        }
        return pa;
    }
}