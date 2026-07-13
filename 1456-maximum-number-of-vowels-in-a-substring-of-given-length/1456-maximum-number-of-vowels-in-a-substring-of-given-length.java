class Solution {
    public int maxVowels(String s, int k) {
        String vowel="aeiou";
        int left=0;
        int ans=0;
        int count=0;
        
        for(int right=0;right<s.length();right++){

            char ch=s.charAt(right);
           if(vowel.indexOf(ch) != -1){
                count++;
            }

            if(right-left+1>k){
                char l = s.charAt(left);
                if(vowel.indexOf(l)!=-1){
                    count-- ;
                } 
               left++;
            }
            ans=Math.max(ans,count);
       }
        return ans;
    }
}