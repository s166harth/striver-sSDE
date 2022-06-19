class Sorter implements Comparator<Job>{                                    
    public int compare(Job o1 ,Job o2){
        return o2.profit-o1.profit;
    }
}
class Solution
{ 
   
    int[] JobScheduling(Job arr[], int n)
    {
        int total=0;
        int count=0;
        Arrays.sort(arr,new Sorter());
        boolean[] avail=new boolean[101];
    
        for(int i=0;i<arr.length;i++)
        {
            if(avail[arr[i].deadline]==false)
            {
                total+=arr[i].profit;
                avail[arr[i].deadline]=true;
                count++;
            }
            else 
            {
                for(int j=arr[i].deadline-1;j>=1;j--)
                {
                    if(avail[j]==false)
                    {
                        count++;
                        total+=arr[i].profit;
                        avail[j]=true;
                        break;
                    }
                }
            }
        }
   
        return new int[]{count,total};
    }
    
}