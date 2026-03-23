class Solution {
    public String removeStars(String s) {
        Stack<Character> st=new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<=s.length()-1;i++){
            char ch = s.charAt(i);
            if(ch != '*'){
               sb.append(ch);              
            }else{
                sb.deleteCharAt(sb.length()-1);
            }
        }
        return sb.toString();
    }
}