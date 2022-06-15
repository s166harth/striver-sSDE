public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode nA = headA; 
        ListNode nB = headB;
        while(nA!=nB){
            if(nA==null) // resetting logic
                nA = headB;
            else
                nA = nA.next;

            if(nB==null) // resetting logic
                nB = headA;
            else
                nB = nB.next;
        }
        return nA;
    }
}