class Solution {
    public int calculate(String s) {
        
        Stack<Integer> st = new Stack<>();
        int n=s.length();

        // int ans=0;
        int num=0;
        char op = '+';
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num = num * 10 + ch-'0';
            }
            if(!Character.isDigit(ch ) && ch!=' ' || i==n-1){
                if(op=='+'){
                    st.push(num);
                }else if(op=='-'){
                    st.push(-num);
                }else if(op=='*'){
                    st.push(st.pop()*num);
                }else if(op=='/'){
                    st.push(st.pop()/num);
                }

                num = 0;
                op=ch;
            }
        }
        int ans=0;
        for(int val:st){
            ans+=val;
        }
        return ans;
        }
    
}