class Solution {
    public int numIdenticalPairs(int[] nums) {
        
        int result=0;
        int r=0;
        int n=nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){

            result+=map.getOrDefault(nums[i],0);
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);

            
        }
        return result;
    }
}