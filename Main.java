class GfG
{
   int maxLen(int arr[], int n)
   {
       // Your code here
       HashMap<Integer,Integer> hm = new HashMap<>();
       int res = 0;
       int sum = 0;
       hm.put(0,-1);
       
       for(int i=0; i<arr.length; i++){
           sum += arr[i];
           if(!hm.containsKey(sum)){
               hm.put(sum, i);
           }
           else{
               int idx = hm.get(sum);
               res = Math.max(res,i-idx);
           }
           
       }
      return res; 
   }
}
