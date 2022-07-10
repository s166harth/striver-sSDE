class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans = new int[2];
        int s=0;
        int end = numbers.length-1;
        while(s<e)
        {
            if(numbers[s]+numbers[end]<target)
            {
                s++;
            }
            if(numbers[s]+numbers[end]>target)
            {
                end--;
            }
            if(numbers[s]+numbers[end]==target)
            {
                ans[0]=numbers[s];
        ans[1]=numbers[end];
        return ans;
            }
        }
        return null;
        
    }
}