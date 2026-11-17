class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        sub(nums,new ArrayList<>(),result,0);
        return result;
        
    }
    public void sub(int[] nums,List<Integer>ans,List<List<Integer>>result,int i){

        if(i==nums.length){
            result.add(new ArrayList<>(ans));
            return;
        }

        ans.add(nums[i]);
        sub(nums,ans,result,i+1);

        ans.remove(ans.size()-1);
        sub(nums,ans,result,i+1);

    }
}  