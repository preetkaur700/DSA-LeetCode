class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character>st = new Stack<>();
        Stack<Character>st1=new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch=='#'){
                if(!st.isEmpty()){
                    st.pop();
                }
            }else{
                st.push(ch);
            }
        }
         for(int j=0;j<t.length();j++){
            char ch=t.charAt(j);
            if(ch=='#'){
                if(!st1.isEmpty()){
                    st1.pop();
                }
            }
            else{
                st1.push(ch);
            }
        }

        return st.equals(st1);

    }
}