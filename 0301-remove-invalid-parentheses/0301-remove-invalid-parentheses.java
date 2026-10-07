class Solution {
    public List<String> removeInvalidParentheses(String s) {
        
        List<String> list = new ArrayList<>();
        Queue<String>q=new LinkedList<>();
        Set<String>v = new HashSet<>();
        boolean found=false;
        q.add(s);
        v.add(s);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                String current = q.poll();

                if(isValid(current)){
                    list.add(current);
                    found=true;
                }
                
                if(found)continue;
                
                for(int j=0;j<current.length();j++){
                    String next = current.substring(0,j)+current.substring(j+1);

                    if(!v.contains(next)){
                        v.add(next);
                        q.add(next);
                    }

                }
            }
            if(found)break;
        }

        return list;

    }

    public boolean isValid(String s){
        int open=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                open++;
            }else if(ch==')'){
                open--;
                if(open<0)return false;
            }
        }
        return open==0;
    }
}