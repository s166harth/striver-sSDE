class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null) return list2;
                if(list2 == null) return list1;
                
                ListNode node;
                
                if(list1.val < list2.val) {
                    node = new ListNode(list1.val);
                    list1 = list1.next;
                }
                else {
                    node = new ListNode(list2.val);
                    list2 = list2.next;
                }
                ListNode curr = node;
                    
                while (list1 != null && list2 != null) {
                    if(list1.val < list2.val) {
                        curr.next = list1;
                        curr = curr.next;
                        list1 = list1.next;
                    }else {
                        curr.next = list2;
                        curr = curr.next;
                        list2 = list2.next;
                    }
                }
                while (list1 != null) {
                    curr.next = list1;
                    curr = curr.next;
                    list1 = list1.next;
                }
                while (list2 != null) {
                    curr.next = list2;
                    curr = curr.next;
                    list2 = list2.next;
                }
                 curr.next = null;
                
                 return node;
             }
         }
}