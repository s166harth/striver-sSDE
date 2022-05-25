class Solution {
   public void nextPermutation(int[] nums) {
   
      int i1 = nums.length-2;
      int i2=nums.length-1;
      while(i1>=0&&nums[i1]>=nums[i1+1])i1--;
      if(i1>=0){while(i2>=0&&nums[i2]<nums[i1])i2--;
      int temp=nums[i1];
      nums[i1]=nums[i2];
      nums[i2]=temp;
      }

      i2=nums.length-1;
      i1++;
      while(i1<i2)
      {
      int temp=nums[i1];
      nums[i1]=nums[i2];
      nums[i2]=temp;
      i1++;
      i2--;

      }
   
   
   }
}
       
 