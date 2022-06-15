import java.util.HashMap;

class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {

        HashMap<String,Integer> t=new HashMap<>();
        for(int i=0;i<list1.length;i++)
        {
            t.put(list1[i],i);

        }
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0;i<list2.length;i++)
            if(t.containsKey(list2[i]))
                map.put(list2[i], i + t.get(list2[i]));
        
        
        int min = Collections.min(map.values());
        ArrayList<String> l = new ArrayList<>();
        for(Map.Entry<String, Integer> entry:map.entrySet())
            if(entry.getValue()==min)
                l.add(entry.getKey());
        
        
        String[] ans = new String[l.size()];
        for(int i=0;i<ans.length;i++)
            ans[i] = l.get(i);
        
        return ans;
    }
}