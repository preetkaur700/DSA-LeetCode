class Solution {
    public int longestOnes(int[] nums, int k) {
        int l = 0 ;
        int count0 = 0;
        int a  = 0;
        int m = 0;
        for(int r= 0;r<nums.length;r++){

            if(nums[r]==0 ){
                count0++;
            }
            while(count0 > k){
                if(nums[l]==0 ){
                     count0--;
                }
               
                l++;
            }
             m = Math.max(m,r-l+1);
        }
        return m;
    }
}