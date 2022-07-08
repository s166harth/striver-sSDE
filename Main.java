class Solution {
    public boolean isSymmetric(TreeNode root) {
        return func(root.left,root.right);
    }
    public boolean func(TreeNode a,TreeNode b)
    {
        if(a==null&&b==null)return true;
        if(a==null||b==null||a.val!=b.val)return false;
        return func(a.left, b.right)&&func(a.right,b.left);

    }
}