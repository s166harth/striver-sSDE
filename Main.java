import java.util.Arrays;

class Solution {
    public int[] getAverages(int[] nums, int k) {
        int len = 2*k +1;
        int sum=0;
        int[] ans = new int[nums.length];
       Arrays.fill(ans, -1);
       if(nums.length<len)return ans;
       int s=0, e=0,i=k;
       while(e<nums.length)
       {
            while(e<s+len)
            {
                sum+=nums[e];
                e++;
            }
        int avg = sum/len;
        ans[i]=avg;
        i++;
        sum-=nums[s];
        s++;

       }
       return ans;

    }
}