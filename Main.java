class Solution {
    public Node flatten(Node head) {
        
        Node cur=head;
        Node iter = head;
        
        while(cur!=null)
        {
            if(cur.child!=null)
            {
                iter=cur.child;
                while(iter.next!=null)iter=iter.next;
                iter.next=cur.next;
                if(cur.next!=null) cur.next.prev=iter;
                cur.next=cur.child;
                cur.child.prev = cur;
                cur.child=null;

            }
            cur=cur.next;
        }
        return head;
    }
}