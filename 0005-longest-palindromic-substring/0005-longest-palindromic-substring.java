class Solution {
    public String longestPalindrome(String s)
    {
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int maxlen=0, start=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(isPalindrome(s,i,j)==true){
                    int len=j-i+1;
                    if(len>maxlen){
                        maxlen=len;
                        start=i;
                    }
                }
            }
        }
        for(int i=start;i<start+maxlen;i++){
            sb.append(s.charAt(i));
        }
        return sb.toString();
    }
    public boolean isPalindrome(String s,int st,int end){
        while(st<end){
            if(s.charAt(st)!=s.charAt(end))return false;
            st++;
            end--;
            
        }
        return true;
    }
}