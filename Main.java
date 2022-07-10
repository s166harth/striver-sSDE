class Solution {

    public TreeNode listToTree(ListNode head)
    {
        if(head == null) return null;
        if(head.next == null) return new TreeNode(head.val);
        ListNode start = head;
        ListNode slow = head;
        ListNode mid = head;
        ListNode fast = head;
        while(fast != null && fast.next != null)
        {
            mid = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        mid.next = null;
        ListNode secondHead = slow.next;
        TreeNode node = new TreeNode(slow.val);
        node.left = listToTree(start);
        node.right = listToTree(secondHead);``
    
        return node;
    
        }
        public TreeNode sortedListToBST(ListNode head)
        {
            if(head == null) return null;
            if(head.next == null) return new TreeNode(head.val);
            return listToTree(head);
            
        }
    }