class Solution {
    public List<String> generateParenthesis(int n) {
        List<String>result = new ArrayList<>();
        gen(result,0,0,n,new StringBuilder());
        return result;
    }
    public void gen(List<String>result,int open,int close,int n,StringBuilder sb){

        if(sb.length()==n*2){
            result.add(sb.toString());
            return;
        }
        if(open<n){
            sb.append('(');
            gen(result,open+1,close,n,sb);
            sb.deleteCharAt(sb.length()-1);
        }
        if(close<open){
            sb.append(')');
            gen(result,open,close+1,n,sb);
            sb.deleteCharAt(sb.length()-1);
        }
    }
}