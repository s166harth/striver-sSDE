import java.util.HashMap;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[]  ans = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],i);
        }
        int[] arr = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            arr[i]=target-nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            if(hm.containsKey(arr[i]))
            {
                ans[0]=i;
                ans[1]=hm.get(arr[i]);
            }
        }
        return ans;
    }
}