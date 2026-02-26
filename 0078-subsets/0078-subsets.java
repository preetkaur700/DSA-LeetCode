class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        set(nums,0,result,new ArrayList<>());
        return result;
    }
    public void set(int[] nums,int i,List<List<Integer>>result,List<Integer>ans){

        if(i==nums.length){
            result.add(new ArrayList<>(ans));
            return;
        }

        // result.add(new ArrayList<>());
        ans.add(nums[i]);
        set(nums,i+1,result,ans);

        ans.remove(ans.size()-1);
        set(nums,i+1,result,ans);
        

    }
}