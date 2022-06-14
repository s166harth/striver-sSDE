class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int exp=0;
        int sum=0;
        while(l1!=null&&l2!=null)
        {
            sum=sum+ l1*(int)Math.pow(10, exp) + l2*(int)Math.pow(10, exp);
            exp+=1;
            l1=l1.next;
            l2=l2.next;

        }
        if(l1!=null)
        {
            while(l1!=null)
            {
                sum=sum+ l1*(int)Math.pow(10, exp);
            exp+=1;
            l1=l1.next;

            }
        }
        else if(l2!=null)
        {
            while(l2!=null)
            {
                sum=sum+ l2*(int)Math.pow(10, exp);
            exp+=1;
            l2=l2.next;

            }
        }
        return sum;
    }
}