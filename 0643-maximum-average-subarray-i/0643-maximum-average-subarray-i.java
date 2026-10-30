class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max=Double. NEGATIVE_INFINITY;
        double sum=0;

        int j=0;
        int count=0;
        double average=0;
        int n = nums.length;
        if(n==1)return (double)nums[0];
        for(int i=0;i<nums.length;i++){
            sum+=nums[i];
            count++;

            if(count==k){
                max = Math.max(max,sum);
                 average = max/k;

                sum-=nums[j];
                j++;
                count--;
            }
        }
        return average;
    }
}