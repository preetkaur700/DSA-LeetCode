class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
       List<List<Integer>>result=new ArrayList<>();
       comb(candidates,target,result,new ArrayList<>(),0);
       return result;
    }
    public void comb(int[] nums,int t,List<List<Integer>>result,List<Integer>ans,int i){
    
    if(i==nums.length){
        if(t==0){
            result.add(new ArrayList<>(ans));
        }
        return;
    }
        if(nums[i]<=t){
            ans.add(nums[i]);
            comb(nums,t-nums[i],result,ans,i);
            ans.remove(ans.size()-1);
        }
        comb(nums,t,result,ans,i+1);

    }


}