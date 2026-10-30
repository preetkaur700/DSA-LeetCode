class Solution {
    public long maximumSubarraySum(int[] nums, int k) {

        int n = nums.length;
        int j=0;
        long sum=0;
        long max=0;
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            while(set.contains(nums[i])){
                set.remove(nums[j]);
                sum-=nums[j];
                j++;
            }
           set.add(nums[i]);
           sum+=nums[i];

           if(set.size()>k){
            set.remove(nums[j]);
            sum-=nums[j];
            j++;
           }
           if(set.size()==k){
            max = Math.max(max,sum);
           }
        }
        return max;

    }
}