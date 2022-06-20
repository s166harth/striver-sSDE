class Solution {
    List<List<Integer>> res = new ArrayList<>();
    Set<Integer> set = new HashSet<>();
    
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<>();
        backtrack(nums, 0, list, nums.length);
        return res;
        
    }
    
    private void backtrack(int[] nums, int current, List<Integer> list, int length){
        if(list.size() == length){
            this.res.add(new ArrayList(list));
            return;
        }
        
        for (int i = 0; i < nums.length; i++){
            if(set.contains(i))
                continue;
            list.add(nums[i]);
            set.add(i);
            backtrack(nums, i+1, list, length);
            set.remove(i);
            list.remove(list.size()-1);
        }
    }
}