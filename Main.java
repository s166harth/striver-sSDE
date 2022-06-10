import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

class Solution {
    public List<Integer> majorityElement(int[] nums) {
    List<Integer> ans = new ArrayList<>();
    HashMap<Integer,Integer> hm=new HashMap<>();
    for(int i=0;i<nums.length;i++)
    {
        if(hm.containsKey(nums[i]))
        {
            int f=hm.get(nums[i]);
            hm.put(nums[i], f++);
        }
        else
        {
            hm.put(nums[i], 1);
        }
    }
    int floor = (int)Math.floor(nums.length/3);
    Set<Integer> keys = hm.keySet();
    for(Integer key: keys)
    {
        if(hm.get(key)>floor)
        {
            ans.add(key);
        }
    }
    return ans;
    }
}