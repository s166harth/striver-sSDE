class Solution {
    public int superPow(int a, int[] b) {
        int et=1140; //eulers toitent function, jump to leetcode article for details
        int num=0;
        for(int i=0;i<b.length;i++)

        {
            int exp = (int)Math.pow(10, b.length-1-i);
            num+= b[i]*exp;

        }
        return (int)Math.pow(a,num%et)%1337;
    }
}