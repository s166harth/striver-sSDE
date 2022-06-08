class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(!map.containsKey(nums[i]))
            {
                map.put(nums[i], 1);
                
            }
            else
            {
                int value = map.get(nums[i]);
                map.put(nums[i], value+1);
            }
        }
        
        int element = 0;
        
        for(Map.Entry<Integer, Integer> m : map.entrySet())
        {
            if(m.getValue() > (nums.length/2))
            {
                element = m.getKey();
            }
        }
        
        return element;
    }
}