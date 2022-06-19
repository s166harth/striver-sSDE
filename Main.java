
class Solution
{
   //Function to find the minimum number of platforms required at the
   //railway station such that no train waits.
   static int findPlatform(int arr[], int dep[], int n)
   {
       Arrays.sort(arr);
       Arrays.sort(dep);
      
      int j=0,temp=1;
      
      for(int i=1;i<n;i++)
          if(arr[i]>dep[j])
             j++;
          else
           temp++;
      
       return temp;
   }
   
}

