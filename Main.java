import javax.swing.tree.TreeNode;

class Solution {
    public void flatten(TreeNode root) {
        TreeNode cur=root;
        TreeNode pre=root;
        while(cur!=null)
        {
            if(cur.left!=null)
            {
                pre = cur.left;
                while(pre.right!=null)pre=pre.right;
                pre.right=cur.right;
                cur.right=cur.left;
                cur.left=null;



            }
            cur=cur.right;

        }
    }
}