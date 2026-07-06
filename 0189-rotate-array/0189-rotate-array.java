class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        // int[] result=new int[n];
        // for(int i=0;i<nums.length;i++){
        //     result[(i+k)%n] = nums[i];
        // }
        // for(int i=0;i<n;i++){
        //     nums[i]=result[i];
        // }
        k=k%n;
        reverse(nums,0,n-1);
        reverse(nums,0,k-1);
        reverse(nums,k,n-1);
    }
    public void reverse(int arr[],int left,int right){
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}