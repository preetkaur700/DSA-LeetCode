class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>>result=new ArrayList<>();
        sub(nums,result,new ArrayList<>(),0);
        return result;
    }
    public void sub(int[] nums,List<List<Integer>>result,List<Integer>ans,int i)
    {
        if(i==nums.length){
            result.add(new ArrayList<>(ans));
            return;
        }
        
            ans.add(nums[i]);
            sub(nums,result,ans,i+1);

            ans.remove(ans.size()-1);
            sub(nums,result,ans,i+1);
        
        
    }
}