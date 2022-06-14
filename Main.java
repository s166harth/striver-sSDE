class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast=head;
        ListNode slow=head;
        ListNode prev=head;
        for(int i=0;i<n,i++)
        {
            fast=fast.next;
        }
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next;
        }
        while(prev.next!=slow)
        {
            prev=prev.next;
        }
        prev=slow.next;
        return head;
    }

    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
              
             ListNode dummy = new ListNode(-1, head);
            
              ListNode fast = head;
              ListNode slow = dummy;
            
              for(int i=1; i<=n; i++){
                  fast = fast.next;
              }
            
              while(fast != null){
                  slow = slow.next;
                  fast = fast.next;
              }
            
              slow.next = slow.next.next;
              return dummy.next;
              
        }
    }
}