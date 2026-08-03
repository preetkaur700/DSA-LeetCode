class Solution {
    public void sortColors(int[] nums) {
        int n=nums.length;
        int low=0,mid=0,high=n-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(low,mid,nums);
                low++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==2){
                swap(mid,high,nums);
                high--;
            }
        }
    }
    public static void swap(int a,int b,int[] arr){
       
            int tep = arr[a];
            arr[a]=arr[b];
            arr[b]=tep;

        
    }
}