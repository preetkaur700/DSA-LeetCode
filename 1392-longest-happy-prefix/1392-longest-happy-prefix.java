class Solution {
    public String longestPrefix(String s) {
        int n = s.length();
        int p=0;
        int sf=1;
        int[] lps = new int[n];
        while(sf<n){
            if(s.charAt(sf)==s.charAt(p)){
                p++;
                lps[sf]=p;
                sf++;
            }else{

                if(p==0){
                    lps[sf]=0;
                    sf++;
                }else{
                    p=lps[p-1];
                }
            }
        }
        int r = lps[n-1];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<r;i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}