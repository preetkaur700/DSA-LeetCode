class Solution {
    public List<List<Integer>> combine(int n, int k) {
        
        List<List<Integer>>result = new ArrayList<>();
        comb(n,k,result,new ArrayList<>(),1);
        return result;
    }
    public void comb(int n,int k,List<List<Integer>>result,List<Integer>ans,int i){
        if(ans.size()==k){
            result.add(new ArrayList<>(ans));
            return;
        }
        for(int j=i;j<=n;j++){
            ans.add(j);
            comb(n,k,result,ans,j+1);
            ans.remove(ans.size()-1);
        }     
    }
}