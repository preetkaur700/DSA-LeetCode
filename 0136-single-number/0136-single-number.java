class Solution {
    public int singleNumber(int[] nums) {
        int ans=0;
        Arrays.sort(nums);
        int i=0;
        while(i<nums.length && i+1<nums.length){
            if(nums[i]==nums[i+1]){
                i=i+2;
                continue;
            }else{
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
        
        // int ans=0;
        // for(int i=0;i<nums.length;i++){
        //     ans^=nums[i];
        // }
        // return ans;
    
}