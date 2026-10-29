class Solution {
    public int majorityElement(int[] nums) {
        int count=1;
        int max = 0;
        Arrays.sort(nums);
        int n = nums.length;
        if(n==1)return nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]){
                count++;
            }else{
                count=1;
            }
            if(count>n/2)return nums[i];
        }
        return 0;

    }
}