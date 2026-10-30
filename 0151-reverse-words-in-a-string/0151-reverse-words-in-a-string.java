class Solution {
    public String reverseWords(String s) {
        String[] wrds = s.trim().split("\\s++");
        StringBuilder sb = new StringBuilder();
        // int n = s.length()-1;
        for(int i=wrds.length-1;i>=0;i--){
            sb.append(wrds[i]);

            if(i>0){
                sb.append(" ");
            }

        }
        return sb.toString();
    }
}