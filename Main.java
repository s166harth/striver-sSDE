import java.util.ArrayList;
import java.util.List;

class Solution {
  public static int bi(int n,int k)
   {
      if(n==k||k==0) return 1;
      else{
         return bi(n-1,k)+bi(n-1,k-1);
      }
   }
   

   public List<Integer> getRow(int rowIndex) {
       List<Integer> ans = new ArrayList<Integer>();
      for(int i=0;i<rowIndex;i++)
      {
         ans.add(bi(rowIndex,i));
      }
      return ans;
   }
   
}
