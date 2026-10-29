class Solution {
    public void sortColors(int[] nums) {

        int n = nums.length;
        int low=0;
        int mid=0;
        int high=n-1;

        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,low,mid);
                mid++;
                low++;
            }else if(nums[mid]==1){
                mid++;
            }else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
        }
    }

    public void swap(int[] arr,int l,int r){
        int temp = arr[l];;
        arr[l]=arr[r];
        arr[r]=temp;
    }
}