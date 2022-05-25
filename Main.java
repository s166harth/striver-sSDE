class Solution {
   public int maxProfit(int[] prices) {
       int min = 10000000;
       int today=0;
       int ans=0;
       for(int i=0;i<prices.length;i++)
       {
           min = Math.min(min,prices[i]);
           today = prices[i]-min;
           ans=Math.max(ans,today);
       }
       return ans;
       
   }
}