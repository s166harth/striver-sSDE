


 
class Solution {
    public class ListNode {
        int val;
         ListNode next;
         ListNode() {}
         ListNode(int val) { this.val = val; }
         ListNode(int val, ListNode next) { this.val = val; this.next = next; }
     }
    public ListNode reverseList(ListNode head) {

   
           
                
                 if(head == null){
                    return head;
                }
                
                if(head != null && head.next == null){
                    return head;
                }
                
                ListNode prev = null;
                ListNode cur = head;
                ListNode nex = head.next;
                while(nex!=null)
                {
                    cur.next=prev;
                    prev=cur;
                    cur=nex;
                    nex=nex.next;
                }
                cur.next=prev;
                return cur;
        
            }
        
            

    }
