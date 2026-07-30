class Solution {
    public String reverseWords(String s) {
        
        String[] wrd=s.trim().split("\\s+");

        StringBuilder b = new StringBuilder();
        for(int i=wrd.length-1;i>=0;i--){
            b.append(wrd[i]);
            if(i>0) b.append(" ");
        }
        return b.toString();
    }
}