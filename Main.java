class Solution {
    // Function to convert a binary tree into its mirror tree.
    void mirror(Node node) {
        // Your code here
        if(node==null)
        {
            return;
        }
         mirror(node.right);
        mirror(node.left);
     
            Node temp=node.left;
            
            node.left=node.right;
            node.right=temp;
       
        return;
    }
}