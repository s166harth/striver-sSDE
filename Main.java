

class Solution {
    public Node copyRandomList(Node head) {
         if(head==null){
            return head;
        }
        Node iter=head;
        
        while(iter!=null)
        {
            Node dummy = new Node(iter.val);
            dummy.next=iter.next;
            iter.next=dummy;
            iter=iter.next.next;
        }
        iter = head;
    
        while(iter!=null){
            Node random = iter.random;
            
            if(random!=null){
                iter.next.random = random.next;
            }
            
            iter = iter.next.next;
        }
        Node p1 = head;
        Node p2 = head.next;
        Node newH = p2;
        
        while(true){
            Node n1 = p2.next;
            if(n1==null){
                p1.next = null;
                break;
            }
            
            Node n2 = n1.next;
            
            p1.next = n1;
            p2.next = n2;
            
            p1 = n1;
            p2=n2;
        }
        
        return newH;
    }
}