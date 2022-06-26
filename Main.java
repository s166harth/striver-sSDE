class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder s = new StringBuilder(a);
        int count=1;
        while(s.length()<b.length()){
            count++;
            s.append(a);
        }
        
        if(searchByRabin(s.toString(),b)) return count;
        s.append(a);
        if(searchByRabin(s.toString(),b)) return count+1;
        return -1;
    }
    
    private boolean searchByRabin(String s, String pat){
        int p=0,t=0;
        int q=101;
        int h=1;
        int d=256;
        int m=pat.length(),n=s.length();
        for(int i=0;i<m-1;i++) h = (h*d)%q;
        for(int i=0;i<m;i++){
            p = (d*p+pat.charAt(i))%q;
            t = (d*t+s.charAt(i))%q;
        }
        for(int i=0;i<=n-m;i++){
            if(p==t){
                boolean match = true;
                for(int j=0;j<m;j++){
                    if(pat.charAt(j)!=s.charAt(i+j)) {
                        match = false;
                        break;
                    }
                    if(match) return true;
                }
            }
            if(i<n-m){
                t = (d*(t-h*s.charAt(i))+s.charAt(i+m))%q;
                if(t<0) t += q;
            }
        }
        return false;
    }
}