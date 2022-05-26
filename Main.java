import java.util.Arrays;

class Solution {
   public int[][] merge(int[][] intervals) {
 
      int[][] ans = new int[intervals.length][2];
      Arrays.sort(intervals, (a,b)->Integer.compare(a[0],b[0]));
      ans[0][0] = intervals[0][0];
      ans[0][1] = intervals[0][1];
      int length =0;
      for(int i=0; i<intervals.length;i++)
      {
         if(ans[length][1] >= intervals[i][0] ) {
            ans[length][1] = Math.max(ans[length][1],intervals[i][1]);
     } else {
         length++;
         ans[length][0] = intervals[i][0];
         ans[length][1] = intervals[i][1];
         
     }
     

      }
      return Arrays.copyOfRange(ans,0,length+1);
   }
}