class Solution {
    public int singleNonDuplicate(int[] nums) {
        int num=0;
        if(nums.length==1){
            return nums[0];
        }
        if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==nums[i+1]){
                i+=1;
            }else{
                num=nums[i];
            }
        }        
        return num;
    }
}