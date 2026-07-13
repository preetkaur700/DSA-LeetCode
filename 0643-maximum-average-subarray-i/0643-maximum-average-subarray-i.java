class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0;
        double ave=-Double.MAX_VALUE;
       double sum=0;
        for(int r=0;r<nums.length;r++){
            sum+=nums[r];
            if(r-l+1>k){
                sum-=nums[l];
                l++;
            }

            if(r-l+1==k){
                ave=Math.max(ave,sum/k);
            }
            
        }
        return ave;
    }
}            