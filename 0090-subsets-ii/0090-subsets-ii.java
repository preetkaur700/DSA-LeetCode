class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
       List<List<Integer>> result=new ArrayList<>();
       subset(nums,result,new ArrayList(),0);
       return result;

    }
    public void subset(int[]nums,List<List<Integer>>result,List<Integer>ans,int i){
        
            result.add(new ArrayList<>(ans));
           
        
        
        for(int j=i;j<nums.length;j++){
            if(j>i && nums[j]==nums[j-1])continue;
            ans.add(nums[j]);
            subset(nums,result,ans,j+1);

            ans.remove(ans.size()-1);
        }       
        
    }
}