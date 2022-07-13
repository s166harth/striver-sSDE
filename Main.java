class Solution {
    public int maxProduct(int[] nums) {
        int max=nums[0],min=nums[0],res=nums[0],n=nums.length;
        
        for(int i=1;i<n;i++){
            if(nums[i]<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(nums[i],max*nums[i]);
            min=Math.min(nums[i],min*nums[i]);
            res=Math.max(res,max);
        }
        return res;
    }
    
}