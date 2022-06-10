class Solution {
    public int uniquePaths(int m, int n) {
        int g = Math.max(m, n)-1;
        int num=1;
        int den=1;
        for(int i=0;i<g;i++)
        {
            num *= m+n-2-i;
        }
        for(int i=0;i<g;i++)
        {
            den *= g-i;
        }
        return (int)(num/den);
    }
}