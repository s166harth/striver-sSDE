import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int superPow(int a, int[] b) {
        a = a % 1337; 
        if (a <= 1) return a;
        
        Map<Integer, Integer> map = new HashMap<>();  // power of a -> a^power mod 1337
        Set<Integer> set = new HashSet<>();  // for O(1) search of existing value in the map
		
        int val = a, power = 1;
        while (! set.contains(val)) {
            map.put(power, val);
            set.add(val);
            val = (val * a) % 1337;
            power++;
        }
        
        int reminder = 0;
        for (int i = 0; i < b.length; i++) {
            reminder = (reminder * 10 + b[i]) % set.size();
        }
        
        return map.get(reminder);
    }
}