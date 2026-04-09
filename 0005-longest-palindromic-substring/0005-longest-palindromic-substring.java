class Solution {
    public String longestPalindrome(String s) {
        
        StringBuilder sb = new StringBuilder();
        int maxlen=0,start=0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            for(int j=i;j<s.length();j++){
              if(palindrome(s,i,j)){
                    int len = j-i+1;
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
    public boolean palindrome(String s,int l,int r){
        while(l<r){
            if(s.charAt(l)!=s.charAt(r)){
             
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}