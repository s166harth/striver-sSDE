class Solution {
    public String getPermutation(int n, int k) {
        int fact = 1;
        List<Integer> ds = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            fact = fact * i;
            ds.add(i);
        }
        ds.add(n);
        
        StringBuilder ans = new StringBuilder();
        k -= 1;
        
        while (true) {
            ans.append(ds.get(k / fact));
            ds.remove(k / fact);
            
            if (ds.size() == 0) {
                break;
            }
            
            k %= fact;
            fact /= ds.size();
        }
        return ans.toString();
    }
}