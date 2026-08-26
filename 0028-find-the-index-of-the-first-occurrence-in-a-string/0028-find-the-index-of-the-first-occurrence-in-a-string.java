class Solution {
    public int strStr(String haystack, String needle) {
        
        int h=haystack.length();
        int n = needle.length();
        int i=0;
        int j=0;
        String ch="";
        if(n>h)return -1;
        while(j<h){
            ch += haystack.charAt(j);
            if(j-i+1==n){
                if(ch.equals(needle)){
                    return i;
                }
                ch=ch.substring(1);
                i++;
                
            }
            j++;
        }
        return -1;
    }
}