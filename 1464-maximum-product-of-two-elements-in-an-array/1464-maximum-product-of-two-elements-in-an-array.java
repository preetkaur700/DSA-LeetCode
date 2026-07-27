class Solution {
    public int maxProduct(int[] nums) {
        int  n = nums.length;
        int[] arr = new int[n];

        for(int k=0;k<n;k++){
            arr[k]=nums[k]-1;
        }
        int max=0;
        int mul = 1;                 
       
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                mul=arr[i]*arr[j];
                max = Math.max(max,mul);
            }
        }
        return max;
        
    }
}