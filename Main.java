class Solution {

   public void sortColors(int[] nums) {
      int li=0;
      int mid=0;
      int hi=nums.length-1;
       while(mid<=hi){
         if(nums[mid]==0){
             int temp=nums[li];
             nums[li]=nums[mid];
             nums[mid]=temp;
             mid++;
             li++;
         }
               else if(nums[mid]==1){
                       mid++;
               }
        else{
            int temp2=nums[mid];
             nums[mid]=nums[hi];
             nums[hi]=temp2;
             hi--;       
             } 
       }
   }
   
   }