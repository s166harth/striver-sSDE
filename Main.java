import java.util.Stack;

class Solution {
    public int pairSum(ListNode head) {
        ListNode temp=head;
        if(head==null)return 0;
        int len=0;
        Stack<Integer> st= new Stack<>();
        while(temp!=null)
        {
            st.push(temp.val);
            temp=temp.next;
            len++;

        }
        temp=head;
        int max=-1;
        for(int i=0;i<=(len/2)-1;i++)
        {
            max=(int)Math.max(temp.val+st.pop(), max);
            temp=temp.next;
        }
        return max;
    }
}