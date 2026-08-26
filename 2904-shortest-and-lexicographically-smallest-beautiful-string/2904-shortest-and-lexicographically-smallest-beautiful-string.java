class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        
        int count=0;
        int j=0;
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='1'){
                count++;
            }

            while(count==k){
                String curent = s.substring(j,i+1);
                    
                if(ans.isEmpty() || curent.length()<ans.length() || 
                   ( curent.length()==ans.length() && curent.compareTo(ans)<0)){
                    ans=curent;
                } 
                 if(s.charAt(j)=='1'){
                    count--;
                }           
                j++;  
                }
            }
        return ans;
    }
}