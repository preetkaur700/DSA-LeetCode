class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashSet<Character> set = new HashSet<>();
       int i=0;
       int max=0;
       int len=0;
        
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
            while(set.contains(ch)){
                set.remove(s.charAt(i));
                i++;

            }
            set.add(ch);
            len=Math.max(len,set.size());
            
        }
        return len;

    }
}