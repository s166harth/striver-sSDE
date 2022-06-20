class Solution {
    public boolean isPali(String str){
        int i = 0,j = str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public void solve(String s , int i,int j,List<List<String>> ans,List<String> tmp){
        if(i>j){
            if(tmp.size()!=0){
            ans.add(new ArrayList<>(tmp));
            }
            return;
        }
        tmp.add(s.substring(i,i+1));
        solve(s,i+1,j,ans,tmp);
        tmp.remove(tmp.size()-1);
        for(int k = i+1;k<=j;k++){
            String P = s.substring(i,k+1);
            if(isPali(P)){
                tmp.add(P);
                solve(s,k+1,j,ans,tmp);
                tmp.remove(tmp.size()-1);
            }
        }
    }
    public List<List<String>> partition(String s) {
        int n = s.length();
        List<List<String>> ans = new ArrayList<>();
        List<String> tmp = new ArrayList<>();
        solve(s,0,n-1,ans,tmp);
        return ans;
       
    }
}