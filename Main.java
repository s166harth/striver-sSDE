class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> list=new ArrayList<Integer>();
        Collections.sort(arr);
        req(0,list,arr,N,0);
        return list;
    }
    void req(int index,ArrayList<Integer> list,ArrayList<Integer> arr,int N,int sum){
        list.add(sum);
        if(index==N){ return ; }
        for(int i=index; i<N; i++){
            req(i+1,list,arr,N,sum+arr.get(i));
        }
        
    }
 }