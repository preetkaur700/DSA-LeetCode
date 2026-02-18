class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>>result = new ArrayList<>();
        Arrays.sort(candidates);
        sum(candidates,target,0,result,new ArrayList<>());
        return result;
    }
    public void sum(int[] cd,int target,int index,List<List<Integer>>result,List<Integer>ans){

        if(target==0){
            result.add(new ArrayList<>(ans));
            return;
        }

        for(int i=index;i<cd.length;i++){

            if(i>index && cd[i]==cd[i-1])continue;
            
            if(cd[i]<=target){
                ans.add(cd[i]);
                sum(cd,target-cd[i],i+1,result,ans);
                ans.remove(ans.size()-1);
            }
        }
        
    }
}