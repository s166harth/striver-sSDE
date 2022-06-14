import java.util.LinkedList;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        LinkedList<Character> list=new LinkedList<>();
        int max=0;
        for(int right = 0, left = 0 ; right < s.length() ; right++){
            while(list.contains(s.charAt(right)) && right >= left){
                max = Math.max(max, list.size());
                list.removeFirst();
                left++;
            }
            list.addLast(s.charAt(right));
        }
        max = Math.max(max, list.size());
        return max;
    }
}