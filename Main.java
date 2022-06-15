public class Solution {
    public boolean hasCycle(ListNode head) {
        boolean ans = false;
        ListNode fast=head;
        ListNode slow=head;
        while(fast!=null&&fast.next!=null)
        {
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow)
            {
                ans= true;
            }
        }
        return ans;
    }
}