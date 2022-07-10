class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        return util(nums,0,nums.length-1);
    }
    public TreeNode util(int[] nums,int s,int e)
    {
         if(s>e) return null;
        int mid = (int)Math.floor((s+e)/2);
       
        TreeNode root = new TreeNode(nums[mid]);
        root.left= util(nums,s,mid-1);
        root.right=util(nums,mid+1,e);
        return root;
    }
}