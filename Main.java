// class Solution {
//     public TreeNode search(TreeNode parent,int val)
//     {
//         if(val==parent.val) return parent;
//         else if(val<parent.val) return search(parent.right);
//         else if(val>parent.val) return search(parent.left);
//         return null;

//     }
//     public TreeNode createBinaryTree(int[][] d) {
//         TreeNode cur = new TreeNode(null);
//         TreeNode root=new TreeNode(null);
        
//         for(int i=0;i<d.length;i++)
//         {
//             if(search(root,d[i][0]))
//             {
//                cur = search(root,d[i][0]);
//             }
//             else cur.val = d[i][0];
//             if(search(root,d[i][1])&&d[i][2]==1)
//             {
//                 cur.left = search(root,d[i][1]);
//             }
//             else if(search(root,d[i][1])&&d[i][2]==0)
//             {
//                 cur.right = search(root,d[i][1]);
//             }
//             else if(!search(root,d[i][1])&&d[i][2]==1)
//             {
//                 cur.left = new TreeNode(d[i][1]);

//             }
//             else if(!search(root,d[i][1])&&d[i][2]==0)
//             {
//                 cur.right = new TreeNode(d[i][1]);
                
//             }
//             cur = root;

            

//         }
//     }
// }
class Solution {
    HashMap<Integer, TreeNode> map;
    HashMap<Integer, TreeNode> childSet;
    public TreeNode createBinaryTree(int[][] description) {
        childSet = new HashMap<>();
        map = new HashMap<>();
        for(int i = 0; i < description.length; i++){
            int node = description[i][0];
            int child = description[i][1];
            boolean left = description[i][2] == 1;
            TreeNode root, childNode;
            if(map.containsKey(node))
                root = map.get(node);
            else{
                root = new TreeNode(node);
                map.put(node, root);
            }
            
            if(map.containsKey(child))
                childNode = map.get(child);
            else{
                childNode = new TreeNode(child);
                map.put(child, childNode);
            }
            if(left)
                root.left = childNode;
            else
                root.right = childNode;
            
            childSet.put(child, childNode); 
        }
        for(int i = 0; i < description.length; i++){
            if(!childSet.containsKey(description[i][0]))
                return map.get(description[i][0]);
        }
        return null;
    }
}