class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        comb(n,k,1,result,new ArrayList<>());
        return result; 
    }
    public void comb(int n,int k,int index,List<List<Integer>>result,ArrayList<Integer> ans){

        if(ans.size()==k){
            result.add(new ArrayList<>(ans));
        }

        for(int i=index;i<=n;i++){
            ans.add(i);
            comb(n,k,i+1,result,ans);

            ans.remove(ans.size()-1);
        }

    }
}