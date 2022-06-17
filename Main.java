class Solution {
    public boolean isPalindrome(ListNode head) {
          Stack<ListNode> st = new Stack<>();
        
        ListNode curr = head;
        
        while( curr != null){
            st.push(curr);
            curr = curr.next;
        }
        
        curr = head;
        while(curr != null && !st.isEmpty()){
            if(st.pop().val != curr.val){
                return false;
            }else{
                curr = curr.next;
            }
        }
        
    return true;
    }
}