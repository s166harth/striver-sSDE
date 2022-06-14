


 
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        int i=1;
        ListNode dummy = new ListNode(0,head);
        ListNode prev = dummy;
        ListNode curr = head;
        while(i<left){
           prev = curr;
           curr = curr.next;
            i++;
        }
        ListNode next = curr.next;
        while(i<right){
            ListNode temp = next.next;
            next.next = curr;
            curr = next;
            next = temp;
            i++;
        }
      
       
        ListNode first = prev.next;
        prev.next = curr;
        first.next = next;
        
        return dummy.next;
    }
            

    }
