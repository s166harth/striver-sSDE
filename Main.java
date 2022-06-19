class Solution
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Your code here
        
        Arrays.sort(arr, new Comparator<Item>(){
            public int compare(Item i1, Item i2){
                double i2Ratio = (i2.value*1.0)/i2.weight;
                double i1Ratio = (i1.value*1.0)/i1.weight;
                if(i2Ratio>i1Ratio){
                    return 1;
                }else if(i2Ratio<i1Ratio){
                    return -1;
                }
                    return 0;
                
            }
        });
        
        double maxVal = 0;
        
        for(Item it:arr){
            if(W>0){
                int weightTaken = it.weight <= W ? it.weight : W;
                maxVal = maxVal + ((it.value*1.0)/it.weight)*weightTaken;
                W = W-weightTaken;
            }else{
                break;
            }
            
        }
        return maxVal;
    }
}