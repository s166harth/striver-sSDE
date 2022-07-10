class Solution {
    // public boolean isValidBST(TreeNode root) {
    //     if(root.right==null && root.left==null) return true;
    //     if(root.right==null&&root.left!=null)
    //     {
    //         if(root.left.val<root.val)return isValidBST(root.left);
    //         else return false;
    //     }
    //     if(root.left==null&&root.right!=null)
    //     {
    //         if(root.right.val>root.val)return isValidBST(root.right);
    //         else return false;
    //     }
    //     return root.left.val<root.val && root.right.val>root.val && isValidBST(root.right) && isValidBST(root.left);
    // }
    // wrong because you are checking the indivisual node only and not entire tree so works for only one level
    public boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root,Long.MIN_VALUE,Long.MAX_VALUE);
    }

    private boolean isValidBSTHelper(TreeNode root, long minValue, long maxValue) {
        if(root == null) return true;
        
        if(root.val >= maxValue || root.val <= minValue) return false;
        return (isValidBSTHelper(root.left,minValue, root.val) && 
                isValidBSTHelper(root.right, root.val, maxValue));
    }
}