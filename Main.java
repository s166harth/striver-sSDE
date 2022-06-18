import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>(); 
        for(int i=0; i<nums.length-2;i++) {               
            // If we start with the same last element continue;
            if (i > 0 && nums[i] == nums[i-1]) continue;                              
                                                       
                 
            int j =i+1;                                           
            int  k = nums.length-1;                      
                                                       
            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];     
                if (sum > 0) k -= 1; 
                else if (sum < 0) j += 1; 
                else { 
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j += 1; 
                    
                    while(nums[j] == nums[j-1] && j < k) j += 1;
                    
                }
            } 
        }
        return ans;
        
    }
}