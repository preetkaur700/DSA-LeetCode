class Solution {
    public int maxProduct(int[] nums) {
        int  n = nums.length;
        // int[] arr = new int[n];

        // for(int k=0;k<n;k++){
        //     arr[k]=nums[k]-1;
        // }
        // int max=0;
        // int mul = 1;                 
       
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         mul=arr[i]*arr[j];
        //         max = Math.max(max,mul);
        //     }
        // }
        // return max;
/////////////////
        // Arrays.sort(nums);

        // return (nums[n-1]-1)*(nums[n-2]-1);

/////////////////
        int max1=0,max2=0;
        for(int arr:nums){
            if(arr>max1){
                max2=max1;
                max1=arr;
            }else if(arr>max2) {
                max2=arr;
            }
        }
        return (max1-1)*(max2-1);
    }
}