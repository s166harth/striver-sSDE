public class Solution {
    public ListNode detectCycle(ListNode head) {
    ListNode slow=head;
    ListNode fast=head;
    boolean flag=false;
    while(fast!=null && fast.next!=null){
    slow=slow.next;
    fast=fast.next.next;
    if(slow==fast) {flag=true;break;}
    }
    ListNode temp=head;
    if(flag){
    while(temp!=slow){
    temp=temp.next;
    slow=slow.next;
    }}
    else return null;
    return temp;
    }
    }