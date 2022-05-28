class Solution {
   static void swap(int[] num,int m,int n)
   {
      int temp = num[n];
      num[n] = num[m];
      num[m] = temp;
   }
   public void merge(int[] nums1, int m, int[] nums2, int n) {
         for(int i=0;i<n;i++)
         {
            nums1[m+i]=nums2[i];

         }
         int gap=(m+n)/2 + (m+n)%2;
         int i=0;
         
        while (true) {
            i = 0;
            while (i < nums1.length-gap) {
                if (nums1[i] > nums1[i+gap]) 
                    swap(nums1, i, i+gap);
                i++;
            }
            if (gap == 1) break;
            gap = gap / 2 + gap % 2;
        }
   }
}