class Solution {
    public int strStr(String haystack, String needle) {
        int nl=needle.length();
        int hl=haystack.length();
        if(nl==0) return 0;
        for(int i=0;i<hl;i++){
            if(i+nl<=hl){
                if(needle.equals(haystack.substring(i,i+nl))){
                    return i;
                }
            }
        }
        return -1;
    }
}