class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>> result = new ArrayList<>();
       sum(candidates,target,0,result,new ArrayList<>());
       return result;
    }
    
    public void sum(int[] cd,int target,int i,List<List<Integer>> result, List<Integer> ans){
        if(i==cd.length){
            if(target==0){
                result.add(new ArrayList<>(ans));
            }
            return;
        }

        if(cd[i]<=target){
            ans.add(cd[i]);
            sum(cd,target-cd[i],i,result,ans);
            ans.remove(ans.size()-1);
        }
        sum(cd,target,i+1,result,ans);
        
    }

}